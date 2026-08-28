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

public class fsb {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final ffe c;
   private final epv d;

   public fsb(ffe $$0, epv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dcb $$1, dyr $$2, Function<jw, dyo> $$3, fnc $$4) {
      this.c.d(new fmi(xo.c("selectWorld.data_read")));
      epv.c $$5 = this.a($$0);
      if ($$5 != null) {
         atz $$6 = auc.a($$5);
         dcr $$7 = $$1.g();

         try {
            ama.d $$8 = new ama.d($$6, $$7, false, false);
            amb $$9 = this.a($$8, $$3x -> {
               dyo.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(lq.aT));
               return new ama.b<>(new epz($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, amb::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private epv.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fjl.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (evf var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fmr.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(epv.c $$0, alp $$1, jp<aln> $$2, eqb $$3) {
      atz $$4 = auc.a($$0);
      aue $$5 = (aue)new ama.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new amb($$5, $$1, $$2, $$3), true);
   }

   public amb a(Dynamic<?> $$0, boolean $$1, atz $$2) throws Exception {
      ama.d $$3 = epv.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jv<dvu> $$2x = $$1x.d().d(lq.aT);
         eps $$3x = epv.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ama.b<>($$3x.a(), $$3x.b().b());
      }, amb::new);
   }

   public Pair<dcb, frz> a(epv.c $$0) throws Exception {
      atz $$1 = auc.a($$0);
      Dynamic<?> $$2 = $$0.h();
      ama.d $$3 = epv.a($$2, $$1, false);

      record a(dcb a, dyr b, jv<dvu> c) {
      }

      return this.a($$3, $$1x -> {
         jv<dvu> $$2x = new jq<>(lq.aT, Lifecycle.stable()).l();
         eps $$3x = epv.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ama.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new frz($$3x.b, new dyo($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ama.d $$0, ama.f<D> $$1, ama.e<D, R> $$2) throws Exception {
      ama.c $$3 = new ama.c($$0, eq.a.c, 2);
      CompletableFuture<R> $$4 = ama.a($$3, $$1, $$2, ac.g(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(epv.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xo $$4;
      xo $$5;
      if ($$1) {
         $$4 = xo.c("selectWorld.backupQuestion.customized");
         $$5 = xo.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xo.c("selectWorld.backupQuestion.experimental");
         $$5 = xo.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new flp($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            frt.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(ffe $$0, frr $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new flu($$5, xo.c("selectWorld.warning.experimental.title"), xo.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new flu($$5, xo.c("selectWorld.warning.deprecated.title"), xo.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fmi(xo.c("selectWorld.data_read")));
      epv.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(epv.c $$0, Runnable $$1) {
      this.c.d(new fmi(xo.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      epw $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (vc | vi | IOException var10) {
         this.c.a(new fnb(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         ayw.b();
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

   private void a(epv.c $$0, epw $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new flo($$3, xo.c("selectWorld.incompatible.title").b(-65536), xo.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         epw.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            yc $$7 = xo.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xo $$8 = xo.a($$6, $$1.k(), aa.b().c());
            this.c.a(new flp(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  frt.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(epv.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fmi(xo.c("selectWorld.resource_load")));
      atz $$4 = auc.a($$0);

      amb $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (dvu $$6 : $$5.c().a().d(lq.aT)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new flz(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new flo($$3, xo.c("datapackFailure.safeMode.failed.title"), xo.c("datapackFailure.safeMode.failed.description"), xn.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(epv.c $$0, amb $$1, atz $$2, Runnable $$3) {
      eqb $$4 = $$1.d();
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

   private void b(epv.c $$0, amb $$1, atz $$2, Runnable $$3) {
      gro $$4 = this.c.ae();
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

   private void a(epv.c $$0, amb $$1, gro $$2, atz $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new flu($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xo.c("selectWorld.warning.lowDiskSpace.title").a(n.m), xo.c("selectWorld.warning.lowDiskSpace.description"), xn.j, xn.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(epv.c $$0, amb $$1, atz $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gro $$0, epv.c $$1) {
      Path $$2 = $$1.a(ept.k);
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
      this.c.a(new flu($$0::complete, xo.c("multiplayer.texturePrompt.failure.line1"), xo.c("multiplayer.texturePrompt.failure.line2"), xn.i, xn.e));
      return $$0;
   }
}
