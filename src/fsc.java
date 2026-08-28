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

public class fsc {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fff c;
   private final epw d;

   public fsc(fff $$0, epw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dcc $$1, dys $$2, Function<jw, dyp> $$3, fnd $$4) {
      this.c.d(new fmj(xp.c("selectWorld.data_read")));
      epw.c $$5 = this.a($$0);
      if ($$5 != null) {
         aua $$6 = aud.a($$5);
         dcs $$7 = $$1.g();

         try {
            amb.d $$8 = new amb.d($$6, $$7, false, false);
            amc $$9 = this.a($$8, $$3x -> {
               dyp.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lq.aT));
               return new amb.b<>(new eqa($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amc::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private epw.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fjm.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (evg var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fms.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(epw.c $$0, alq $$1, jp<alo> $$2, eqc $$3) {
      aua $$4 = aud.a($$0);
      auf $$5 = (auf)new amb.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amc($$5, $$1, $$2, $$3), true);
   }

   public amc a(Dynamic<?> $$0, boolean $$1, aua $$2) throws Exception {
      amb.d $$3 = epw.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jv<dvv> $$2x = $$1x.d().d(lq.aT);
         ept $$3x = epw.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new amb.b<>($$3x.a(), $$3x.b().b());
      }, amc::new);
   }

   public Pair<dcc, fsa> a(epw.c $$0) throws Exception {
      aua $$1 = aud.a($$0);
      Dynamic<?> $$2 = $$0.h();
      amb.d $$3 = epw.a($$2, $$1, false);

      record a(dcc a, dys b, jv<dvv> c) {
      }

      return this.a($$3, $$1x -> {
         jv<dvv> $$2x = new jq<>(lq.aT, Lifecycle.stable()).l();
         ept $$3x = epw.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new amb.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fsa($$3x.b, new dyp($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(amb.d $$0, amb.f<D> $$1, amb.e<D, R> $$2) throws Exception {
      amb.c $$3 = new amb.c($$0, eq.a.c, 2);
      CompletableFuture<R> $$4 = amb.a($$3, $$1, $$2, ac.g(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(epw.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xp $$4;
      xp $$5;
      if ($$1) {
         $$4 = xp.c("selectWorld.backupQuestion.customized");
         $$5 = xp.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xp.c("selectWorld.backupQuestion.experimental");
         $$5 = xp.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new flq($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fru.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fff $$0, frs $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new flv($$5, xp.c("selectWorld.warning.experimental.title"), xp.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new flv($$5, xp.c("selectWorld.warning.deprecated.title"), xp.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fmj(xp.c("selectWorld.data_read")));
      epw.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(epw.c $$0, Runnable $$1) {
      this.c.d(new fmj(xp.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      epx $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (vd | vj | IOException var10) {
         this.c.a(new fnc(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         ayx.b();
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

   private void a(epw.c $$0, epx $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new flp($$3, xp.c("selectWorld.incompatible.title").b(-65536), xp.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         epx.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            yd $$7 = xp.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xp $$8 = xp.a($$6, $$1.k(), aa.b().c());
            this.c.a(new flq(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fru.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(epw.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fmj(xp.c("selectWorld.resource_load")));
      aua $$4 = aud.a($$0);

      amc $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dvv $$6 : $$5.c().a().d(lq.aT)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new fma(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new flp($$3, xp.c("datapackFailure.safeMode.failed.title"), xp.c("datapackFailure.safeMode.failed.description"), xo.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(epw.c $$0, amc $$1, aua $$2, Runnable $$3) {
      eqc $$4 = $$1.d();
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

   private void b(epw.c $$0, amc $$1, aua $$2, Runnable $$3) {
      grp $$4 = this.c.ae();
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

   private void a(epw.c $$0, amc $$1, grp $$2, aua $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new flv($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xp.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xp.c("selectWorld.warning.lowDiskSpace.description"), xo.j, xo.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(epw.c $$0, amc $$1, aua $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(grp $$0, epw.c $$1) {
      Path $$2 = $$1.a(epu.k);
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
      this.c.a(new flv($$0::complete, xp.c("multiplayer.texturePrompt.failure.line1"), xp.c("multiplayer.texturePrompt.failure.line2"), xo.i, xo.e));
      return $$0;
   }
}
