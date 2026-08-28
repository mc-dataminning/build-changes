import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fss {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final ffw c;
   private final eqk d;

   public fss(ffw $$0, eqk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dck $$1, dze $$2, Function<jx, dzb> $$3, fnl $$4) {
      this.c.d(new fmw(wu.c("selectWorld.data_read")));
      eqk.c $$5 = this.a($$0);
      if ($$5 != null) {
         ath $$6 = atk.a($$5);
         ddb $$7 = $$1.g();

         try {
            alg.d $$8 = new alg.d($$6, $$7, false, false);
            alh $$9 = this.a($$8, $$3x -> {
               dzb.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lr.ba));
               return new alg.b<>(new eqo($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, alh::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private eqk.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fkc.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (evw var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fnd.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(eqk.c $$0, akv $$1, jq<akt> $$2, eqq $$3) {
      ath $$4 = atk.a($$0);
      atm $$5 = (atm)new alg.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new alh($$5, $$1, $$2, $$3), true);
   }

   public alh a(Dynamic<?> $$0, boolean $$1, ath $$2) throws Exception {
      alg.d $$3 = eqk.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jw<dwh> $$2x = $$1x.d().d(lr.ba);
         eqh $$3x = eqk.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new alg.b<>($$3x.a(), $$3x.b().b());
      }, alh::new);
   }

   public Pair<dck, fsq> a(eqk.c $$0) throws Exception {
      ath $$1 = atk.a($$0);
      Dynamic<?> $$2 = $$0.h();
      alg.d $$3 = eqk.a($$2, $$1, false);

      record a(dck a, dze b, jw<dwh> c) {
      }

      return this.a($$3, $$1x -> {
         jw<dwh> $$2x = new jr<>(lr.ba, Lifecycle.stable()).m();
         eqh $$3x = eqk.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new alg.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fsq($$3x.b, new dzb($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(alg.d $$0, alg.f<D> $$1, alg.e<D, R> $$2) throws Exception {
      alg.c $$3 = new alg.c($$0, er.a.c, 2);
      CompletableFuture<R> $$4 = alg.a($$3, $$1, $$2, ac.g(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(eqk.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wu $$4;
      wu $$5;
      if ($$1) {
         $$4 = wu.c("selectWorld.backupQuestion.customized");
         $$5 = wu.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wu.c("selectWorld.backupQuestion.experimental");
         $$5 = wu.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fmf($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fsk.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(ffw $$0, fsi $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fmj($$5, wu.c("selectWorld.warning.experimental.title"), wu.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fmj($$5, wu.c("selectWorld.warning.deprecated.title"), wu.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fmw(wu.c("selectWorld.data_read")));
      eqk.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(eqk.c $$0, Runnable $$1) {
      this.c.d(new fmw(wu.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      eql $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ui | uo | IOException var10) {
         this.c.a(new fnk(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         aye.b();
         System.gc();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         o $$8 = o.a($$7, $$6);
         p $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new y($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(eqk.c $$0, eql $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fme($$3, wu.c("selectWorld.incompatible.title").b(-65536), wu.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         eql.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xi $$7 = wu.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wu $$8 = wu.a($$6, $$1.k(), aa.b().c());
            this.c.a(new fmf(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fsk.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(eqk.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fmw(wu.c("selectWorld.resource_load")));
      ath $$4 = atk.a($$0);

      alh $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dwh $$6 : $$5.c().a().d(lr.ba)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fmo(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fme($$3, wu.c("datapackFailure.safeMode.failed.title"), wu.c("datapackFailure.safeMode.failed.description"), wt.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(eqk.c $$0, alh $$1, ath $$2, Runnable $$3) {
      eqq $$4 = $$1.d();
      boolean $$5 = $$4.y().e();
      boolean $$6 = $$4.B() != Lifecycle.stable();
      if (!$$5 && !$$6) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         this.a($$0, $$5, () -> this.b($$0, $$1, $$2, $$3), () -> {
            $$1.close();
            $$0.c();
            $$3.run();
         });
      }
   }

   private void b(eqk.c $$0, alh $$1, ath $$2, Runnable $$3) {
      gsg $$4 = this.c.ae();
      this.a($$4, $$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
         a.warn("Failed to load pack: ", $$0x);
         return this.a();
      }, this.c).thenAcceptAsync($$5 -> {
         if ($$5) {
            this.a($$0, $$1, $$4, $$2, $$3);
         } else {
            $$4.e();
            $$1.close();
            $$0.c();
            $$3.run();
         }
      }, this.c).exceptionally($$0x -> {
         this.c.a(o.a($$0x, "Load world"));
         return null;
      });
   }

   private void a(eqk.c $$0, alh $$1, gsg $$2, ath $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fmj($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wu.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wu.c("selectWorld.warning.lowDiskSpace.description"), wt.j, wt.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(eqk.c $$0, alh $$1, ath $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gsg $$0, eqk.c $$1) {
      Path $$2 = $$1.a(eqi.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.c.a(new fmj($$0::complete, wu.c("multiplayer.texturePrompt.failure.line1"), wu.c("multiplayer.texturePrompt.failure.line2"), wt.i, wt.e));
      return $$0;
   }
}
