import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URL;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import org.slf4j.Logger;

public class erq extends err {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.connect.connecting");
   private final eor d;
   private final fah e;

   public erq(fah $$0, eor $$1) {
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public void run() {
      eos $$0;
      try {
         $$0 = this.f();
      } catch (CancellationException var4) {
         b.info("User aborted connecting to realms");
         return;
      } catch (epn var5) {
         switch (var5.a.a()) {
            case 6002:
               a(new eqv(this.e, this.d));
               return;
            case 6006:
               boolean $$3 = esr.N().b(this.d.g);
               a(
                  (fah)($$3
                     ? new epy(this.e, this.d.a, this.d.m == eor.d.b)
                     : new eqe(ur.c("mco.brokenworld.nonowner.title"), ur.c("mco.brokenworld.nonowner.error"), this.e))
               );
               return;
            default:
               this.a(var5);
               b.error("Couldn't connect to world", var5);
               return;
         }
      } catch (TimeoutException var6) {
         this.a(ur.c("mco.errorMessage.connectionFailure"));
         return;
      } catch (Exception var7) {
         b.error("Couldn't connect to world", var7);
         this.a(var7);
         return;
      }

      boolean $$7 = $$0.b != null && $$0.c != null;
      fah $$8 = (fah)($$7 ? this.a($$0, this::a) : this.a($$0));
      a($$8);
   }

   @Override
   public ur a() {
      return c;
   }

   private eos f() throws epn, TimeoutException, CancellationException {
      eoa $$0 = eoa.a();

      for (int $$1 = 0; $$1 < 40; $$1++) {
         if (this.d()) {
            throw new CancellationException();
         }

         try {
            return $$0.c(this.d.a);
         } catch (epo var4) {
            a((long)var4.c);
         }
      }

      throw new TimeoutException();
   }

   public eqh a(eos $$0) {
      return new eqi(this.e, new ern(this.e, this.d, $$0));
   }

   private eqg a(eos $$0, Function<eos, fah> $$1) {
      BooleanConsumer $$2 = $$2x -> {
         if (!$$2x) {
            a(this.e);
         } else {
            this.b($$0).thenRun(() -> a($$1.apply($$0))).exceptionally($$1xx -> {
               esr.N().ab().a();
               b.error("Failed to download resource pack from {}", $$0, $$1xx);
               a(new eqe(ur.c("mco.download.resourcePack.fail"), this.e));
               return null;
            });
         }
      };
      return new eqg($$2, eqg.a.b, ur.c("mco.configure.world.resourcepack.question.line1"), ur.c("mco.configure.world.resourcepack.question.line2"), true);
   }

   private CompletableFuture<?> b(eos $$0) {
      try {
         return esr.N().ab().a(new URL($$0.b), $$0.c, false);
      } catch (Exception var4) {
         CompletableFuture<Void> $$2 = new CompletableFuture<>();
         $$2.completeExceptionally(var4);
         return $$2;
      }
   }
}
