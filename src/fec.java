import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class fec extends fed {
   private static final xo b = xo.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final xo d = xo.c("mco.connect.connecting");
   private final fbd e;
   private final fnb f;

   public fec(fnb $$0, fbd $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbe $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (fbz var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new fdh(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = ffd.Q().b(this.e.g);
               a(
                  (fnb)($$3
                     ? new fck(this.f, this.e.a, this.e.m == fbd.d.b)
                     : new fcq(xo.c("mco.brokenworld.nonowner.title"), xo.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(xo.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fnb $$8 = (fnb)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(fbd $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public xo a() {
      return d;
   }

   private fbe f() throws fbz, TimeoutException, CancellationException {
      fam $$0 = fam.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (fca var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public fct a(fbe $$0) {
      return new fcu(this.f, new fdz(this.f, this.e, $$0));
   }

   private fcs a(fbe $$0, UUID $$1, Function<fbe, fnb> $$2) {
      BooleanConsumer $$3 = $$3x -> {
         if (!$$3x) {
            a(this.f);
         } else {
            a(new fmh(b));
            this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
               ffd.Q().ae().i();
               c.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new fcq(xo.c("mco.download.resourcePack.fail"), this.f));
               return null;
            });
         }
      };
      return new fcs($$3, fcs.a.b, xo.c("mco.configure.world.resourcepack.question.line1"), xo.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> a(fbe $$0, UUID $$1) {
      try {
         grn $$2 = ffd.Q().ae();
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
