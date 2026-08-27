import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class epw extends epx {
   private static final Logger b = LogUtils.getLogger();
   private static final tn c = tn.c("mco.connect.connecting");
   private final emy d;
   private final eym e;

   public epw(eym $$0, emy $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      emz $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (enu var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new epc(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = eqx.O().b(this.d.g);
               a(
                  (eym)($$3
                     ? new eof(this.e, this.d.a, this.d.m == emy.c.b)
                     : new eol(tn.c("mco.brokenworld.nonowner.title"), tn.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(tn.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      eym $$8 = (eym)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public tn a() {
      return c;
   }

   private emz f() throws enu, TimeoutException, CancellationException {
      emh $$0 = emh.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (env var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eoo a(emz $$0) {
      return new eop(this.e, new epu(this.e, this.d, $$0));
   }

   private eon a(emz $$0, Function<emz, eym> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               eqx.O().ac().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new eol(tn.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new eon($$2, eon.a.b, tn.c("mco.configure.world.resourcepack.question.line1"), tn.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(emz $$0) {
      try {
         return eqx.O().ac().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
