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

public class fon {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fbp c;
   private final emr d;

   public fon(fbp $$0, emr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, czb $$1, dvp $$2, Function<iz, dvm> $$3, fjo $$4) {
      this.c.d(new fiu(wg.c("selectWorld.data_read")));
      emr.c $$5 = this.a($$0);
      if ($$5 != null) {
         asn $$6 = asq.a($$5);
         czr $$7 = $$1.g();

         try {
            ako.d $$8 = new ako.d($$6, $$7, false, false);
            akp $$9 = this.a($$8, $$3x -> {
               dvm.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ks.aP));
               return new ako.b<>(new emv($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, akp::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private emr.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         ffx.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (erp var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fjd.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(emr.c $$0, akd $$1, is<akc> $$2, emx $$3) {
      asn $$4 = asq.a($$0);
      ass $$5 = (ass)new ako.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new akp($$5, $$1, $$2, $$3), true);
   }

   public akp a(Dynamic<?> $$0, boolean $$1, asn $$2) throws Exception {
      ako.d $$3 = emr.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         iy<dss> $$2x = $$1x.d().d(ks.aP);
         emo $$3x = emr.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ako.b<>($$3x.a(), $$3x.b().b());
      }, akp::new);
   }

   public Pair<czb, fol> a(emr.c $$0) throws Exception {
      asn $$1 = asq.a($$0);
      Dynamic<?> $$2 = $$0.h();
      ako.d $$3 = emr.a($$2, $$1, false);

      record a(czb a, dvp b, iy<dss> c) {
      }

      return this.a($$3, $$1x -> {
         iy<dss> $$2x = new it<>(ks.aP, Lifecycle.stable()).l();
         emo $$3x = emr.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ako.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fol($$3x.b, new dvm($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ako.d $$0, ako.f<D> $$1, ako.e<D, R> $$2) throws Exception {
      ako.c $$3 = new ako.c($$0, dv.a.c, 2);
      CompletableFuture<R> $$4 = ako.a($$3, $$1, $$2, ac.f(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(emr.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wg $$4;
      wg $$5;
      if ($$1) {
         $$4 = wg.c("selectWorld.backupQuestion.customized");
         $$5 = wg.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wg.c("selectWorld.backupQuestion.experimental");
         $$5 = wg.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fib($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fof.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fbp $$0, fod $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fig($$5, wg.c("selectWorld.warning.experimental.title"), wg.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fig($$5, wg.c("selectWorld.warning.deprecated.title"), wg.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fiu(wg.c("selectWorld.data_read")));
      emr.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(emr.c $$0, Runnable $$1) {
      this.c.d(new fiu(wg.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      ems $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (tx | ud | IOException var10) {
         this.c.a(new fjn(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         axi.b();
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

   private void a(emr.c $$0, ems $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fia($$3, wg.c("selectWorld.incompatible.title").b(-65536), wg.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         ems.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            wu $$7 = wg.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wg $$8 = wg.a($$6, $$1.k(), aa.b().c());
            this.c.a(new fib(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fof.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(emr.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fiu(wg.c("selectWorld.resource_load")));
      asn $$4 = asq.a($$0);

      akp $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);
      } catch (Exception var8) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var8);
         if (!$$2) {
            this.c.a(new fil(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fia($$3, wg.c("datapackFailure.safeMode.failed.title"), wg.c("datapackFailure.safeMode.failed.description"), wf.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(emr.c $$0, akp $$1, asn $$2, Runnable $$3) {
      emx $$4 = $$1.d();
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

   private void b(emr.c $$0, akp $$1, asn $$2, Runnable $$3) {
      gny $$4 = this.c.ae();
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

   private void a(emr.c $$0, akp $$1, gny $$2, asn $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fig($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wg.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wg.c("selectWorld.warning.lowDiskSpace.description"), wf.j, wf.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(emr.c $$0, akp $$1, asn $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gny $$0, emr.c $$1) {
      Path $$2 = $$1.a(emp.k);
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
      this.c.a(new fig($$0::complete, wg.c("multiplayer.texturePrompt.failure.line1"), wg.c("multiplayer.texturePrompt.failure.line2"), wf.i, wf.e));
      return $$0;
   }
}
