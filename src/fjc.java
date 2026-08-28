import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fjc extends fjd {
   private static final xj b = xj.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xj d = xj.c("mco.connect.connecting");
   private final fgi e;
   private final frw f;

   public fjc(frw $$0, fgi $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fgj $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fhc var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fij(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fke.Q().b(this.e.g);
               a(
                  (frw)($$3
                     ? new fho(this.f, this.e.a, this.e.i())
                     : new fhu(xj.c("mco.brokenworld.nonowner.title"), xj.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xj.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      frw $$8 = (frw)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fgi $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xj a() {
      return d;
   }

   private fgj f() throws fhc, TimeoutException, CancellationException {
      ffh $$0 = ffh.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fhd var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fhw a(fgj $$0) {
      return new fhx(this.f, new fja(this.f, this.e, $$0));
   }

   private fnf a(fgj $$0, UUID $$1, Function<fgj, frw> $$2) {
      xj $$3 = xj.c("mco.configure.world.resourcepack.question");
      return fic.a(this.f, $$3, $$3x -> {
         a(new frh(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fke.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fhu(xj.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fgj $$0, UUID $$1) {
      try {
         hcd $$2 = fke.Q().af();
         CompletableFuture<Void> $$3 = $$2.b($$1);
         $$2.g();
         $$2.a($$1, new URL($$0.b), $$0.c);
         return $$3;
      } catch (Exception var5) {
         CompletableFuture<Void> $$5 = new CompletableFuture<>();
         $$5.completeExceptionally(var5);
         return $$5;
      }
   }
}
