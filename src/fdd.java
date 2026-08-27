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

public class fdd {
   private static final Logger a = LogUtils.getLogger();
   private final eqq b;
   private final ecb c;

   public fdd(eqq $$0, ecb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(eyf $$0, String $$1) {
      this.a($$0, $$1, false, true);
   }

   public void a(String $$0, cpu $$1, dll $$2, Function<hu, dli> $$3) {
      ecb.c $$4 = this.a($$0);
      if ($$4 != null) {
         ana $$5 = and.a($$4);
         cqj $$6 = $$1.g();

         try {
            afo.d $$7 = new afo.d($$5, $$6, false, false);
            afp $$8 = this.a($$7, $$3x -> {
               dli.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(je.aI));
               return new afo.b<>(new ecf($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, afp::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private ecb.c a(String $$0) {
      try {
         return this.c.c($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         eur.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (egx var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(exu.a(null));
         return null;
      }
   }

   public void a(ecb.c $$0, afe $$1, hn<afd> $$2, ech $$3) {
      ana $$4 = and.a($$0);
      anf $$5 = (anf)new afo.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new afp($$5, $$1, $$2, $$3), true);
   }

   private afp a(ecb.c $$0, boolean $$1, ana $$2) throws Exception {
      afo.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rn> $$2x = aes.a(rf.a, $$1x.c());
         ht<dio> $$3x = $$1x.d().d(je.aI);
         Pair<ech, dli.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afo.b<>((ech)$$4.getFirst(), ((dli.b)$$4.getSecond()).b());
         }
      }, afp::new);
   }

   public Pair<cpu, fdb> a(ecb.c $$0) throws Exception {
      ana $$1 = and.a($$0);
      afo.d $$2 = this.b($$0, false, $$1);

      record a(cpu a, dll b, ht<dio> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rn> $$2x = aes.a(rf.a, $$1x.c());
         ht<dio> $$3 = new ho<>(je.aI, Lifecycle.stable()).l();
         Pair<ech, dli.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afo.b<>(new a(((ech)$$4.getFirst()).L(), ((ech)$$4.getFirst()).A(), ((dli.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fdb($$3.b, new dli($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private afo.d b(ecb.c $$0, boolean $$1, ana $$2) {
      cqj $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new afo.d($$2, $$3, $$1, false);
      }
   }

   public afp a(ecb.c $$0, boolean $$1) throws Exception {
      ana $$2 = and.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(afo.d $$0, afo.f<D> $$1, afo.e<D, R> $$2) throws Exception {
      afo.c $$3 = new afo.c($$0, du.a.c, 2);
      CompletableFuture<R> $$4 = afo.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(eyf $$0, String $$1, boolean $$2, boolean $$3) {
      ecb.c $$4 = this.a($$1);
      if ($$4 != null) {
         ana $$5 = and.a($$4);

         afp $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new exd(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new ews(
                        () -> this.b.a(null), ti.c("datapackFailure.safeMode.failed.title"), ti.c("datapackFailure.safeMode.failed.description"), th.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         ech $$9 = $$6.d();
         boolean $$10 = $$9.A().e();
         boolean $$11 = $$9.D() != Lifecycle.stable();
         if (!$$3 || !$$10 && !$$11) {
            this.b.ac().a($$4).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
               a.warn("Failed to load pack: ", $$0x);
               return this.a();
            }, this.b).thenAcceptAsync($$5x -> {
               if ($$5x) {
                  this.b.a($$1, $$4, $$5, $$6, false);
               } else {
                  $$6.close();
                  a($$4, $$1);
                  this.b.ac().a().thenRunAsync(() -> this.b.a($$0), this.b);
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
      this.b.a(new ewy($$0::complete, ti.c("multiplayer.texturePrompt.failure.line1"), ti.c("multiplayer.texturePrompt.failure.line2"), th.i, th.e));
      return $$0;
   }

   private static void a(ecb.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(eyf $$0, String $$1, boolean $$2, Runnable $$3) {
      ti $$4;
      ti $$5;
      if ($$2) {
         $$4 = ti.c("selectWorld.backupQuestion.customized");
         $$5 = ti.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = ti.c("selectWorld.backupQuestion.experimental");
         $$5 = ti.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ewt($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fcv.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(eqq $$0, fct $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new ewy($$5, ti.c("selectWorld.warning.experimental.title"), ti.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ewy($$5, ti.c("selectWorld.warning.deprecated.title"), ti.c("selectWorld.warning.deprecated.question")));
      }
   }
}
