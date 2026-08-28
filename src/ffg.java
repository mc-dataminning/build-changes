import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class ffg extends ffh {
   private static final wy b = wy.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wy d = wy.c("mco.connect.connecting");
   private final fcj e;
   private final fnx f;

   public ffg(fnx $$0, fcj $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fck $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fdd var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fel(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fgi.Q().b(this.e.g);
               a(
                  (fnx)($$3
                     ? new fdp(this.f, this.e.a, this.e.i())
                     : new fdv(wy.c("mco.brokenworld.nonowner.title"), wy.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wy.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fnx $$8 = (fnx)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fcj $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wy a() {
      return d;
   }

   private fck f() throws fdd, TimeoutException, CancellationException {
      fbs $$0 = fbs.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fde var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fdx a(fck $$0) {
      return new fdy(this.f, new ffd(this.f, this.e, $$0));
   }

   private fji a(fck $$0, UUID $$1, Function<fck, fnx> $$2) {
      wy $$3 = wy.c("mco.configure.world.resourcepack.question");
      return fed.a(this.f, $$3, $$3x -> {
         a(new fni(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fgi.Q().ae().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fdv(wy.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fck $$0, UUID $$1) {
      try {
         gsv $$2 = fgi.Q().ae();
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
