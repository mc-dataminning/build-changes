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

public class fao extends fap {
   private static final wg b = wg.c("multiplayer.applyingPack");
   private static final Logger c = LogUtils.getLogger();
   private static final wg d = wg.c("mco.connect.connecting");
   private final exp e;
   private final fjo f;

   public fao(fjo $$0, exp $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      exq $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         c.info("User aborted connecting to realms");
         return;
      } catch (eyl var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new ezt(this.f, this.e));
               return;
            case 6006:
               boolean $$3 = fbp.Q().b(this.e.g);
               a(
                  (fjo)($$3
                     ? new eyw(this.f, this.e.a, this.e.m == exp.d.b)
                     : new ezc(wg.c("mco.brokenworld.nonowner.title"), wg.c("mco.brokenworld.nonowner.error"), this.f))
               );
               return;
            default:
               this.a(var5);
               c.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(wg.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         c.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fjo $$8 = (fjo)($$7 ? this.a($$0, a(this.e), this::a) : this.a($$0));
      a($$8);
   }

   private static UUID a(exp $$0) {
      return $$0.o != null
         ? UUID.nameUUIDFromBytes(("minigame:" + $$0.o).getBytes(StandardCharsets.UTF_8))
         : UUID.nameUUIDFromBytes(("realms:" + $$0.c + ":" + $$0.n).getBytes(StandardCharsets.UTF_8));
   }

   @Override
   public wg a() {
      return d;
   }

   private exq f() throws eyl, TimeoutException, CancellationException {
      ewy $$0 = ewy.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.e.a);
         } catch (eym var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public ezf a(exq $$0) {
      return new ezg(this.f, new fal(this.f, this.e, $$0));
   }

   private eze a(exq $$0, UUID $$1, Function<exq, fjo> $$2) {
      BooleanConsumer $$3 = $$3x -> {
         if (!$$3x) {
            a(this.f);
         } else {
            a(new fiu(b));
            this.a($$0, $$1).thenRun(() -> a($$2.apply($$0))).exceptionally($$1xx -> {
               fbp.Q().ae().i();
               c.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new ezc(wg.c("mco.download.resourcePack.fail"), this.f));
               return null;
            });
         }
      };
      return new eze($$3, eze.a.b, wg.c("mco.configure.world.resourcepack.question.line1"), wg.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> a(exq $$0, UUID $$1) {
      try {
         gny $$2 = fbp.Q().ae();
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
