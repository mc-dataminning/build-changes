import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fhx extends fhy {
   private static final xh b = xh.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xh d = xh.c("mco.connect.connecting");
   private final ffa e;
   private final fqs f;

   public fhx(fqs $$0, ffa $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ffb $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (ffu var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fhc(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fja.Q().b(this.e.g);
               a(
                  (fqs)($$3
                     ? new fgg(this.f, this.e.a, this.e.i())
                     : new fgm(xh.c("mco.brokenworld.nonowner.title"), xh.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xh.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fqs $$8 = (fqs)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(ffa $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xh a() {
      return d;
   }

   private ffb f() throws ffu, TimeoutException, CancellationException {
      fej $$0 = fej.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (ffv var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fgo a(ffb $$0) {
      return new fgp(this.f, new fhu(this.f, this.e, $$0));
   }

   private fmb a(ffb $$0, UUID $$1, Function<ffb, fqs> $$2) {
      xh $$3 = xh.c("mco.configure.world.resourcepack.question");
      return fgu.a(this.f, $$3, $$3x -> {
         a(new fqd(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fja.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fgm(xh.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(ffb $$0, UUID $$1) {
      try {
         har $$2 = fja.Q().af();
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
