import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcp {
   private static final Logger a = LogUtils.getLogger();
   private final eqn b;
   private final ebv c;

   public fcp(eqn $$0, ebv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(exv $$0, String $$1) {
      this.a($$0, $$1, false, true);
   }

   public void a(String $$0, cpo $$1, dlf $$2, Function<ht, dlc> $$3) {
      ebv.c $$4 = this.a($$0);
      if ($$4 != null) {
         amv $$5 = amy.a($$4);
         cqd $$6 = $$1.g();

         try {
            afj.d $$7 = new afj.d($$5, $$6, false, false);
            afk $$8 = this.a($$7, $$3x -> {
               dlc.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(jd.aI));
               return new afj.b<>(new ebz($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, afk::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private ebv.c a(String $$0) {
      try {
         return this.c.c($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         eui.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (egu var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(exk.a(null));
         return null;
      }
   }

   public void a(ebv.c $$0, aez $$1, hm<aey> $$2, ecb $$3) {
      amv $$4 = amy.a($$0);
      ana $$5 = (ana)new afj.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new afk($$5, $$1, $$2, $$3), true);
   }

   private afk a(ebv.c $$0, boolean $$1, amv $$2) throws Exception {
      afj.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rl> $$2x = aen.a(rd.a, $$1x.c());
         hs<dii> $$3x = $$1x.d().d(jd.aI);
         Pair<ecb, dlc.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afj.b<>((ecb)$$4.getFirst(), ((dlc.b)$$4.getSecond()).b());
         }
      }, afk::new);
   }

   public Pair<cpo, fcn> a(ebv.c $$0) throws Exception {
      amv $$1 = amy.a($$0);
      afj.d $$2 = this.b($$0, false, $$1);

      record a(cpo a, dlf b, hs<dii> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rl> $$2x = aen.a(rd.a, $$1x.c());
         hs<dii> $$3 = new hn<>(jd.aI, Lifecycle.stable()).l();
         Pair<ecb, dlc.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afj.b<>(new a(((ecb)$$4.getFirst()).L(), ((ecb)$$4.getFirst()).A(), ((dlc.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fcn($$3.b, new dlc($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private afj.d b(ebv.c $$0, boolean $$1, amv $$2) {
      cqd $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new afj.d($$2, $$3, $$1, false);
      }
   }

   public afk a(ebv.c $$0, boolean $$1) throws Exception {
      amv $$2 = amy.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(afj.d $$0, afj.f<D> $$1, afj.e<D, R> $$2) throws Exception {
      afj.c $$3 = new afj.c($$0, dt.a.c, 2);
      CompletableFuture<R> $$4 = afj.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(exv $$0, String $$1, boolean $$2, boolean $$3) {
      ebv.c $$4 = this.a($$1);
      if ($$4 != null) {
         amv $$5 = amy.a($$4);

         afk $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new ewt(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new ewi(
                        () -> this.b.a(null), te.c("datapackFailure.safeMode.failed.title"), te.c("datapackFailure.safeMode.failed.description"), td.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         ecb $$9 = $$6.d();
         boolean $$10 = $$9.A().e();
         boolean $$11 = $$9.D() != Lifecycle.stable();
         if (!$$3 || !$$10 && !$$11) {
            this.b.ab().a($$4).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
               a.warn("Failed to load pack: ", $$0x);
               return this.a();
            }, this.b).thenAcceptAsync($$5x -> {
               if ($$5x) {
                  this.b.a($$1, $$4, $$5, $$6, false);
               } else {
                  $$6.close();
                  a($$4, $$1);
                  this.b.ab().a().thenRunAsync(() -> this.b.a($$0), this.b);
               }
            }, this.b).exceptionally($$0x -> {
               this.b.a(o.a($$0x, "Load world"));
               return null;
            });
         } else {
            this.a($$0, $$1, $$10, () -> this.a($$0, $$1, $$2, false));
            $$6.close();
            a($$4, $$1);
         }
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.b.a(new ewo($$0::complete, te.c("multiplayer.texturePrompt.failure.line1"), te.c("multiplayer.texturePrompt.failure.line2"), td.i, td.e));
      return $$0;
   }

   private static void a(ebv.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(exv $$0, String $$1, boolean $$2, Runnable $$3) {
      te $$4;
      te $$5;
      if ($$2) {
         $$4 = te.c("selectWorld.backupQuestion.customized");
         $$5 = te.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = te.c("selectWorld.backupQuestion.experimental");
         $$5 = te.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ewj($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fch.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(eqn $$0, fcf $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
      BooleanConsumer $$5 = $$3x -> {
         if ($$3x) {
            $$3.run();
         } else {
            $$0.a($$1);
         }
      };
      if ($$4 || $$2 == Lifecycle.stable()) {
         $$3.run();
      } else if ($$2 == Lifecycle.experimental()) {
         $$0.a(new ewo($$5, te.c("selectWorld.warning.experimental.title"), te.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ewo($$5, te.c("selectWorld.warning.deprecated.title"), te.c("selectWorld.warning.deprecated.question")));
      }
   }
}
