import com.mojang.logging.LogUtils;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class feu extends fev {
   private static final wu b = wu.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wu d = wu.c("mco.connect.connecting");
   private final fbv e;
   private final fnl f;

   public feu(fnl $$0, fbv $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbw $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fcr var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fdz(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = ffw.Q().b(this.e.g);
               a(
                  (fnl)($$3
                     ? new fdd(this.f, this.e.a, this.e.i())
                     : new fdj(wu.c("mco.brokenworld.nonowner.title"), wu.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wu.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fnl $$8 = (fnl)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fbv $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wu a() {
      return d;
   }

   private fbw f() throws fcr, TimeoutException, CancellationException {
      fbe $$0 = fbe.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fcs var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fdl a(fbw $$0) {
      return new fdm(this.f, new fer(this.f, this.e, $$0));
   }

   private fiw a(fbw $$0, UUID $$1, Function<fbw, fnl> $$2) {
      wu $$3 = wu.c("mco.configure.world.resourcepack.question");
      return fdr.a(this.f, $$3, $$3x -> {
         a(new fmw(b));
         this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
            ffw.Q().ae().i();
            c.error("Failed to download resource pack from {}", $$0, $$1xx);
            a(new fdj(wu.c("mco.download.resourcePack.fail"), this.f));
            return null;
         });
      });
   }

   private CompletableFuture<?> a(fbw $$0, UUID $$1) {
      try {
         gsg $$2 = ffw.Q().ae();
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
