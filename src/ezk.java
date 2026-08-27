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

public class ezk {
   private static final Logger a = LogUtils.getLogger();
   private final enn b;
   private final dyy c;

   public ezk(enn $$0, dyy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(euq $$0, String $$1) {
      this.a($$0, $$1, false, true);
   }

   public void a(String $$0, cmq $$1, dii $$2, Function<hs, dif> $$3) {
      dyy.c $$4 = this.a($$0);
      if ($$4 != null) {
         aki $$5 = akl.a($$4);
         cnf $$6 = $$1.g();

         try {
            adj.d $$7 = new adj.d($$5, $$6, false, false);
            adk $$8 = this.a($$7, $$3x -> {
               dif.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(jc.aI));
               return new adj.b<>(new dzc($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, adk::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private dyy.c a(String $$0) {
      try {
         return this.c.c($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         erf.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (edx var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(new euv(null));
         return null;
      }
   }

   public void a(dyy.c $$0, ada $$1, hl<acz> $$2, dze $$3) {
      aki $$4 = akl.a($$0);
      akn $$5 = (akn)new adj.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.a(), $$0, $$4, new adk($$5, $$1, $$2, $$3), true);
   }

   private adk a(dyy.c $$0, boolean $$1, aki $$2) throws Exception {
      adj.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rk> $$2x = aco.a(rc.a, $$1x.c());
         hr<dfl> $$3x = $$1x.d().d(jc.aI);
         Pair<dze, dif.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new adj.b<>((dze)$$4.getFirst(), ((dif.b)$$4.getSecond()).b());
         }
      }, adk::new);
   }

   public Pair<cmq, ezi> a(dyy.c $$0) throws Exception {
      aki $$1 = akl.a($$0);
      adj.d $$2 = this.b($$0, false, $$1);

      record a(cmq a, dii b, hr<dfl> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rk> $$2x = aco.a(rc.a, $$1x.c());
         hr<dfl> $$3 = new hm<>(jc.aI, Lifecycle.stable()).l();
         Pair<dze, dif.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new adj.b<>(new a(((dze)$$4.getFirst()).L(), ((dze)$$4.getFirst()).A(), ((dif.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new ezi($$3.b, new dif($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private adj.d b(dyy.c $$0, boolean $$1, aki $$2) {
      cnf $$3 = $$0.d();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new adj.d($$2, $$3, $$1, false);
      }
   }

   public adk a(dyy.c $$0, boolean $$1) throws Exception {
      aki $$2 = akl.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(adj.d $$0, adj.f<D> $$1, adj.e<D, R> $$2) throws Exception {
      adj.c $$3 = new adj.c($$0, dt.a.c, 2);
      CompletableFuture<R> $$4 = adj.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(euq $$0, String $$1, boolean $$2, boolean $$3) {
      dyy.c $$4 = this.a($$1);
      if ($$4 != null) {
         aki $$5 = akl.a($$4);

         adk $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new etp(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new ete(
                        () -> this.b.a(null), sw.c("datapackFailure.safeMode.failed.title"), sw.c("datapackFailure.safeMode.failed.description"), sv.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         dze $$9 = $$6.d();
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
      this.b.a(new etk($$0::complete, sw.c("multiplayer.texturePrompt.failure.line1"), sw.c("multiplayer.texturePrompt.failure.line2"), sv.i, sv.e));
      return $$0;
   }

   private static void a(dyy.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(euq $$0, String $$1, boolean $$2, Runnable $$3) {
      sw $$4;
      sw $$5;
      if ($$2) {
         $$4 = sw.c("selectWorld.backupQuestion.customized");
         $$5 = sw.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = sw.c("selectWorld.backupQuestion.experimental");
         $$5 = sw.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new etf($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            ezc.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(enn $$0, eza $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new etk($$5, sw.c("selectWorld.warning.experimental.title"), sw.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new etk($$5, sw.c("selectWorld.warning.deprecated.title"), sw.c("selectWorld.warning.deprecated.question")));
      }
   }
}
