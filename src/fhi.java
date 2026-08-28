import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fhi extends fhj {
   private static final xd b = xd.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xd d = xd.c("mco.connect.connecting");
   private final fel e;
   private final fqd f;

   public fhi(fqd $$0, fel $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fem $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fff var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fgn(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fil.Q().b(this.e.g);
               a(
                  (fqd)($$3
                     ? new ffr(this.f, this.e.a, this.e.i())
                     : new ffx(xd.c("mco.brokenworld.nonowner.title"), xd.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xd.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fqd $$8 = (fqd)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fel $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xd a() {
      return d;
   }

   private fem f() throws fff, TimeoutException, CancellationException {
      fdu $$0 = fdu.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (ffg var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public ffz a(fem $$0) {
      return new fga(this.f, new fhf(this.f, this.e, $$0));
   }

   private flm a(fem $$0, UUID $$1, Function<fem, fqd> $$2) {
      xd $$3 = xd.c("mco.configure.world.resourcepack.question");
      return fgf.a(this.f, $$3, $$3x -> {
         a(new fpo(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fil.Q().af().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new ffx(xd.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fem $$0, UUID $$1) {
      try {
         gzx $$2 = fil.Q().af();
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
