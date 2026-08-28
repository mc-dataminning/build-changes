import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class ffk extends ffl {
   private static final wz b = wz.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wz d = wz.c("mco.connect.connecting");
   private final fcn e;
   private final fob f;

   public ffk(fob $$0, fcn $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fco $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fdh var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fep(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fgm.Q().b(this.e.g);
               a(
                  (fob)($$3
                     ? new fdt(this.f, this.e.a, this.e.i())
                     : new fdz(wz.c("mco.brokenworld.nonowner.title"), wz.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wz.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fob $$8 = (fob)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fcn $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wz a() {
      return d;
   }

   private fco f() throws fdh, TimeoutException, CancellationException {
      fbw $$0 = fbw.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fdi var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public feb a(fco $$0) {
      return new fec(this.f, new ffh(this.f, this.e, $$0));
   }

   private fjm a(fco $$0, UUID $$1, Function<fco, fob> $$2) {
      wz $$3 = wz.c("mco.configure.world.resourcepack.question");
      return feh.a(this.f, $$3, $$3x -> {
         a(new fnm(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fgm.Q().ae().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fdz(wz.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fco $$0, UUID $$1) {
      try {
         gta $$2 = fgm.Q().ae();
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
