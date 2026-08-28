import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fkx extends fky {
   private static final xv b = xv.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xv d = xv.c("mco.connect.connecting");
   private final fic e;
   private final ftr f;

   public fkx(ftr $$0, fic $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fid $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fix var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fke(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = flz.Q().b(this.e.g);
               a(
                  (ftr)($$3
                     ? new fjj(this.f, this.e.a, this.e.i())
                     : new fjp(xv.c("mco.brokenworld.nonowner.title"), xv.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xv.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      ftr $$8 = (ftr)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fic $$0) {
      return $$0.q != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.q).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.p).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xv a() {
      return d;
   }

   private fid f() throws fix, TimeoutException, CancellationException {
      fhb $$0 = fhb.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fiy var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fjr a(fid $$0) {
      return new fjs(this.f, new fkv(this.f, this.e, $$0));
   }

   private fpb a(fid $$0, UUID $$1, Function<fid, ftr> $$2) {
      xv $$3 = xv.c("mco.configure.world.resourcepack.question");
      return fjx.a(this.f, $$3, $$3x -> {
         a(new ftc(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            flz.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fjp(xv.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fid $$0, UUID $$1) {
      try {
         hed $$2 = flz.Q().af();
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
