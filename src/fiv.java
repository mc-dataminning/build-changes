import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fiv extends fiw {
   private static final xl b = xl.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xl d = xl.c("mco.connect.connecting");
   private final fgb e;
   private final frp f;

   public fiv(frp $$0, fgb $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fgc $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fgv var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fic(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fjx.Q().b(this.e.g);
               a(
                  (frp)($$3
                     ? new fhh(this.f, this.e.a, this.e.i())
                     : new fhn(xl.c("mco.brokenworld.nonowner.title"), xl.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xl.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      frp $$8 = (frp)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fgb $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xl a() {
      return d;
   }

   private fgc f() throws fgv, TimeoutException, CancellationException {
      ffa $$0 = ffa.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fgw var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fhp a(fgc $$0) {
      return new fhq(this.f, new fit(this.f, this.e, $$0));
   }

   private fmy a(fgc $$0, UUID $$1, Function<fgc, frp> $$2) {
      xl $$3 = xl.c("mco.configure.world.resourcepack.question");
      return fhv.a(this.f, $$3, $$3x -> {
         a(new fra(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fjx.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fhn(xl.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fgc $$0, UUID $$1) {
      try {
         hbs $$2 = fjx.Q().af();
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
