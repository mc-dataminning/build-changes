import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fgy extends fgz {
   private static final xd b = xd.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xd d = xd.c("mco.connect.connecting");
   private final feb e;
   private final fpt f;

   public fgy(fpt $$0, feb $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fec $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fev var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fgd(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fib.Q().b(this.e.g);
               a(
                  (fpt)($$3
                     ? new ffh(this.f, this.e.a, this.e.i())
                     : new ffn(xd.c("mco.brokenworld.nonowner.title"), xd.c("mco.brokenworld.nonowner.error"), this.f))
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
      fpt $$8 = (fpt)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(feb $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xd a() {
      return d;
   }

   private fec f() throws fev, TimeoutException, CancellationException {
      fdk $$0 = fdk.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (few var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public ffp a(fec $$0) {
      return new ffq(this.f, new fgv(this.f, this.e, $$0));
   }

   private flc a(fec $$0, UUID $$1, Function<fec, fpt> $$2) {
      xd $$3 = xd.c("mco.configure.world.resourcepack.question");
      return ffv.a(this.f, $$3, $$3x -> {
         a(new fpe(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            fib.Q().ae().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new ffn(xd.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fec $$0, UUID $$1) {
      try {
         gzg $$2 = fib.Q().ae();
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
