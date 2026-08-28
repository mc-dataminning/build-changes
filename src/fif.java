import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fif extends fig {
   private static final xi b = xi.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xi d = xi.c("mco.connect.connecting");
   private final ffi e;
   private final fra f;

   public fif(fra $$0, ffi $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ffj $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fgc var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fhk(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fji.Q().b(this.e.g);
               a(
                  (fra)($$3
                     ? new fgo(this.f, this.e.a, this.e.i())
                     : new fgu(xi.c("mco.brokenworld.nonowner.title"), xi.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xi.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fra $$8 = (fra)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(ffi $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xi a() {
      return d;
   }

   private ffj f() throws fgc, TimeoutException, CancellationException {
      fer $$0 = fer.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fgd var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fgw a(ffj $$0) {
      return new fgx(this.f, new fic(this.f, this.e, $$0));
   }

   private fmj a(ffj $$0, UUID $$1, Function<ffj, fra> $$2) {
      xi $$3 = xi.c("mco.configure.world.resourcepack.question");
      return fhc.a(this.f, $$3, $$3x -> {
         a(new fql(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fji.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fgu(xi.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(ffj $$0, UUID $$1) {
      try {
         hbc $$2 = fji.Q().af();
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
