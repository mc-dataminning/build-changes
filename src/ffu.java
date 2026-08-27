import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffu {
   private static final Logger a = LogUtils.getLogger();
   private final etd b;
   private final een c;

   public ffu(etd $$0, een $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(String $$0, cse $$1, dnp $$2, Function<ip, dnm> $$3, fau $$4) {
      this.b.d(new faa(ur.c("selectWorld.data_read")));
      een.c $$5 = this.a($$0);
      if ($$5 != null) {
         aos $$6 = aov.a($$5);
         cst $$7 = $$1.g();

         try {
            ahd.d $$8 = new ahd.d($$6, $$7, false, false);
            ahe $$9 = this.a($$8, $$3x -> {
               dnm.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(jz.aK));
               return new ahd.b<>(new eer($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ahe::new);
            this.b.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.b.a($$4);
         }
      }
   }

   @Nullable
   private een.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         exg.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ejj var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(faj.a(() -> this.b.a(null)));
         return null;
      }
   }

   public void a(een.c $$0, ags $$1, ij<agr> $$2, eet $$3) {
      aos $$4 = aov.a($$0);
      aox $$5 = (aox)new ahd.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0, $$4, new ahe($$5, $$1, $$2, $$3), true);
   }

   public ahe a(Dynamic<?> $$0, boolean $$1, aos $$2) throws Exception {
      ahd.d $$3 = een.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         io<dks> $$2x = $$1x.d().d(jz.aK);
         eek $$3x = een.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ahd.b<>($$3x.a(), $$3x.b().b());
      }, ahe::new);
   }

   public Pair<cse, ffs> a(een.c $$0) throws Exception {
      aos $$1 = aov.a($$0);
      Dynamic<?> $$2 = $$0.f();
      ahd.d $$3 = een.a($$2, $$1, false);

      record a(cse a, dnp b, io<dks> c) {
      }

      return this.a($$3, $$1x -> {
         io<dks> $$2x = new ik<>(jz.aK, Lifecycle.stable()).l();
         eek $$3x = een.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ahd.b<>(new a($$3x.a().L(), $$3x.a().A(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new ffs($$3x.b, new dnm($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ahd.d $$0, ahd.f<D> $$1, ahd.e<D, R> $$2) throws Exception {
      ahd.c $$3 = new ahd.c($$0, dv.a.c, 2);
      CompletableFuture<R> $$4 = ahd.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(een.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      ur $$4;
      ur $$5;
      if ($$1) {
         $$4 = ur.c("selectWorld.backupQuestion.customized");
         $$5 = ur.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = ur.c("selectWorld.backupQuestion.experimental");
         $$5 = ur.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ezi($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            ffm.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(etd $$0, ffk $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new ezn($$5, ur.c("selectWorld.warning.experimental.title"), ur.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ezn($$5, ur.c("selectWorld.warning.deprecated.title"), ur.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.b.d(new faa(ur.c("selectWorld.data_read")));
      een.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(een.c $$0, Runnable $$1) {
      this.b.d(new faa(ur.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eeo $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (sk | sq | IOException var10) {
         this.b.a(new fat(this.b, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         atk.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.d() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.d());
         throw new y($$8);
      }

      if (!$$3.r()) {
         $$0.a();
         this.b.a(new ezh($$1, ur.c("selectWorld.incompatible.title").b(-65536), ur.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         eeo.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            vf $$15 = ur.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            ur $$16 = ur.a($$14, $$3.k(), aa.b().c());
            this.b.a(new ezi(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  ffm.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   private void a(een.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.b.d(new faa(ur.c("selectWorld.resource_load")));
      aos $$5 = aov.a($$0);

      ahe $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var11) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
         if (!$$2) {
            this.b.a(new ezs(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.b.a(new ezh($$4, ur.c("datapackFailure.safeMode.failed.title"), ur.c("datapackFailure.safeMode.failed.description"), uq.k, true));
         }

         return;
      }

      eet $$9 = $$6.d();
      boolean $$10 = $$9.A().e();
      boolean $$11 = $$9.D() != Lifecycle.stable();
      if (!$$3 || !$$10 && !$$11) {
         this.b.ab().a($$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
            a.warn("Failed to load pack: ", $$0x);
            return this.a();
         }, this.b).thenAcceptAsync($$4x -> {
            if ($$4x) {
               this.b.a($$0, $$5, $$6, false);
            } else {
               $$6.close();
               $$0.a();
               this.b.ab().a().thenRunAsync($$4, this.b);
            }
         }, this.b).exceptionally($$0x -> {
            this.b.a(o.a($$0x, "Load world"));
            return null;
         });
      } else {
         this.a($$0, $$10, () -> this.a($$0, $$1, $$2, false, $$4), () -> {
            $$0.a();
            $$4.run();
         });
         $$6.close();
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.b.a(new ezn($$0::complete, ur.c("multiplayer.texturePrompt.failure.line1"), ur.c("multiplayer.texturePrompt.failure.line2"), uq.i, uq.e));
      return $$0;
   }
}
