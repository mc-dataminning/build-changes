import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fhm extends fhn {
   private static final xe b = xe.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xe d = xe.c("mco.connect.connecting");
   private final fep e;
   private final fqh f;

   public fhm(fqh $$0, fep $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      feq $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (ffj var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fgr(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fip.Q().b(this.e.g);
               a(
                  (fqh)($$3
                     ? new ffv(this.f, this.e.a, this.e.i())
                     : new fgb(xe.c("mco.brokenworld.nonowner.title"), xe.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xe.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fqh $$8 = (fqh)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fep $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xe a() {
      return d;
   }

   private feq f() throws ffj, TimeoutException, CancellationException {
      fdy $$0 = fdy.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (ffk var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fgd a(feq $$0) {
      return new fge(this.f, new fhj(this.f, this.e, $$0));
   }

   private flq a(feq $$0, UUID $$1, Function<feq, fqh> $$2) {
      xe $$3 = xe.c("mco.configure.world.resourcepack.question");
      return fgj.a(this.f, $$3, $$3x -> {
         a(new fps(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fip.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fgb(xe.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(feq $$0, UUID $$1) {
      try {
         hac $$2 = fip.Q().af();
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
