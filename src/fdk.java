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

public class fdk {
   private static final Logger a = LogUtils.getLogger();
   private final eqx b;
   private final eci c;

   public fdk(eqx $$0, eci $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(eym $$0, String $$1) {
      this.a($$0, $$1, false, true);
   }

   public void a(String $$0, cqb $$1, dls $$2, Function<hu, dlp> $$3) {
      eci.c $$4 = this.a($$0);
      if ($$4 != null) {
         ang $$5 = anj.a($$4);
         cqq $$6 = $$1.g();

         try {
            afs.d $$7 = new afs.d($$5, $$6, false, false);
            aft $$8 = this.a($$7, $$3x -> {
               dlp.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(je.aI));
               return new afs.b<>(new ecm($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, aft::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private eci.c a(String $$0) {
      try {
         return this.c.c($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         euy.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ehe var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(eyb.a(null));
         return null;
      }
   }

   public void a(eci.c $$0, afi $$1, hn<afh> $$2, eco $$3) {
      ang $$4 = anj.a($$0);
      anl $$5 = (anl)new afs.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new aft($$5, $$1, $$2, $$3), true);
   }

   private aft a(eci.c $$0, boolean $$1, ang $$2) throws Exception {
      afs.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rs> $$2x = aew.a(rk.a, $$1x.c());
         ht<div> $$3x = $$1x.d().d(je.aI);
         Pair<eco, dlp.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afs.b<>((eco)$$4.getFirst(), ((dlp.b)$$4.getSecond()).b());
         }
      }, aft::new);
   }

   public Pair<cqb, fdi> a(eci.c $$0) throws Exception {
      ang $$1 = anj.a($$0);
      afs.d $$2 = this.b($$0, false, $$1);

      record a(cqb a, dls b, ht<div> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rs> $$2x = aew.a(rk.a, $$1x.c());
         ht<div> $$3 = new ho<>(je.aI, Lifecycle.stable()).l();
         Pair<eco, dlp.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afs.b<>(new a(((eco)$$4.getFirst()).L(), ((eco)$$4.getFirst()).A(), ((dlp.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fdi($$3.b, new dlp($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private afs.d b(eci.c $$0, boolean $$1, ang $$2) {
      cqq $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new afs.d($$2, $$3, $$1, false);
      }
   }

   public aft a(eci.c $$0, boolean $$1) throws Exception {
      ang $$2 = anj.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(afs.d $$0, afs.f<D> $$1, afs.e<D, R> $$2) throws Exception {
      afs.c $$3 = new afs.c($$0, du.a.c, 2);
      CompletableFuture<R> $$4 = afs.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(eym $$0, String $$1, boolean $$2, boolean $$3) {
      eci.c $$4 = this.a($$1);
      if ($$4 != null) {
         ang $$5 = anj.a($$4);

         aft $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new exk(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new ewz(
                        () -> this.b.a(null), tn.c("datapackFailure.safeMode.failed.title"), tn.c("datapackFailure.safeMode.failed.description"), tm.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         eco $$9 = $$6.d();
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
      this.b.a(new exf($$0::complete, tn.c("multiplayer.texturePrompt.failure.line1"), tn.c("multiplayer.texturePrompt.failure.line2"), tm.i, tm.e));
      return $$0;
   }

   private static void a(eci.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(eym $$0, String $$1, boolean $$2, Runnable $$3) {
      tn $$4;
      tn $$5;
      if ($$2) {
         $$4 = tn.c("selectWorld.backupQuestion.customized");
         $$5 = tn.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = tn.c("selectWorld.backupQuestion.experimental");
         $$5 = tn.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new exa($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fdc.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(eqx $$0, fda $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new exf($$5, tn.c("selectWorld.warning.experimental.title"), tn.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new exf($$5, tn.c("selectWorld.warning.deprecated.title"), tn.c("selectWorld.warning.deprecated.question")));
      }
   }
}
