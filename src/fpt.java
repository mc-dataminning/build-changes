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

public class fpt {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fcu c;
   private final enq d;

   public fpt(fcu $$0, enq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, czy $$1, dwo $$2, Function<jj, dwl> $$3, fkt $$4) {
      this.c.d(new fjz(ws.c("selectWorld.data_read")));
      enq.c $$5 = this.a($$0);
      if ($$5 != null) {
         asz $$6 = atc.a($$5);
         dao $$7 = $$1.g();

         try {
            ala.d $$8 = new ala.d($$6, $$7, false, false);
            alb $$9 = this.a($$8, $$3x -> {
               dwl.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ld.aS));
               return new ala.b<>(new enu($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, alb::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private enq.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fhc.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (esu var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fki.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(enq.c $$0, akp $$1, jc<ako> $$2, enw $$3) {
      asz $$4 = atc.a($$0);
      ate $$5 = (ate)new ala.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new alb($$5, $$1, $$2, $$3), true);
   }

   public alb a(Dynamic<?> $$0, boolean $$1, asz $$2) throws Exception {
      ala.d $$3 = enq.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ji<dtr> $$2x = $$1x.d().d(ld.aS);
         enn $$3x = enq.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new ala.b<>($$3x.a(), $$3x.b().b());
      }, alb::new);
   }

   public Pair<czy, fpr> a(enq.c $$0) throws Exception {
      asz $$1 = atc.a($$0);
      Dynamic<?> $$2 = $$0.h();
      ala.d $$3 = enq.a($$2, $$1, false);

      record a(czy a, dwo b, ji<dtr> c) {
      }

      return this.a($$3, $$1x -> {
         ji<dtr> $$2x = new jd<>(ld.aS, Lifecycle.stable()).l();
         enn $$3x = enq.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new ala.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fpr($$3x.b, new dwl($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(ala.d $$0, ala.f<D> $$1, ala.e<D, R> $$2) throws Exception {
      ala.c $$3 = new ala.c($$0, ed.a.c, 2);
      CompletableFuture<R> $$4 = ala.a($$3, $$1, $$2, ac.f(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(enq.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      ws $$4;
      ws $$5;
      if ($$1) {
         $$4 = ws.c("selectWorld.backupQuestion.customized");
         $$5 = ws.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = ws.c("selectWorld.backupQuestion.experimental");
         $$5 = ws.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fjg($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fpl.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fcu $$0, fpj $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fjl($$5, ws.c("selectWorld.warning.experimental.title"), ws.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fjl($$5, ws.c("selectWorld.warning.deprecated.title"), ws.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fjz(ws.c("selectWorld.data_read")));
      enq.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(enq.c $$0, Runnable $$1) {
      this.c.d(new fjz(ws.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      enr $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (uj | up | IOException var10) {
         this.c.a(new fks(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         axu.b();
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

   private void a(enq.c $$0, enr $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fjf($$3, ws.c("selectWorld.incompatible.title").b(-65536), ws.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         enr.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            xg $$7 = ws.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            ws $$8 = ws.a($$6, $$1.k(), aa.b().c());
            this.c.a(new fjg(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  fpl.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(enq.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fjz(ws.c("selectWorld.resource_load")));
      asz $$4 = atc.a($$0);

      alb $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);
      } catch (Exception var8) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var8);
         if (!$$2) {
            this.c.a(new fjq(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fjf($$3, ws.c("datapackFailure.safeMode.failed.title"), ws.c("datapackFailure.safeMode.failed.description"), wr.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(enq.c $$0, alb $$1, asz $$2, Runnable $$3) {
      enw $$4 = $$1.d();
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

   private void b(enq.c $$0, alb $$1, asz $$2, Runnable $$3) {
      gpd $$4 = this.c.ae();
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

   private void a(enq.c $$0, alb $$1, gpd $$2, asz $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fjl($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, ws.c("selectWorld.warning.lowDiskSpace.title").a(n.m), ws.c("selectWorld.warning.lowDiskSpace.description"), wr.j, wr.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(enq.c $$0, alb $$1, asz $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(gpd $$0, enq.c $$1) {
      Path $$2 = $$1.a(eno.k);
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
      this.c.a(new fjl($$0::complete, ws.c("multiplayer.texturePrompt.failure.line1"), ws.c("multiplayer.texturePrompt.failure.line2"), wr.i, wr.e));
      return $$0;
   }
}
