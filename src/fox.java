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

public class fox {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fby c;
   private final ena d;

   public fox(fby $$0, ena $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, czk $$1, dvy $$2, Function<jb, dvv> $$3, fjx $$4) {
      this.c.d(new fjd(wi.c("selectWorld.data_read")));
      ena.c $$5 = this.a($$0);
      if ($$5 != null) {
         asp $$6 = ass.a($$5);
         daa $$7 = $$1.g();

         try {
            akq.d $$8 = new akq.d($$6, $$7, false, false);
            akr $$9 = this.a($$8, $$3x -> {
               dvv.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(ku.aQ));
               return new akq.b<>(new ene($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, akr::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private ena.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         fgg.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (ery var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(fjm.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(ena.c $$0, akf $$1, iu<ake> $$2, eng $$3) {
      asp $$4 = ass.a($$0);
      asu $$5 = (asu)new akq.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new akr($$5, $$1, $$2, $$3), true);
   }

   public akr a(Dynamic<?> $$0, boolean $$1, asp $$2) throws Exception {
      akq.d $$3 = ena.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ja<dtb> $$2x = $$1x.d().d(ku.aQ);
         emx $$3x = ena.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new akq.b<>($$3x.a(), $$3x.b().b());
      }, akr::new);
   }

   public Pair<czk, fov> a(ena.c $$0) throws Exception {
      asp $$1 = ass.a($$0);
      Dynamic<?> $$2 = $$0.h();
      akq.d $$3 = ena.a($$2, $$1, false);

      record a(czk a, dvy b, ja<dtb> c) {
      }

      return this.a($$3, $$1x -> {
         ja<dtb> $$2x = new iv<>(ku.aQ, Lifecycle.stable()).l();
         emx $$3x = ena.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new akq.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fov($$3x.b, new dvv($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(akq.d $$0, akq.f<D> $$1, akq.e<D, R> $$2) throws Exception {
      akq.c $$3 = new akq.c($$0, dw.a.c, 2);
      CompletableFuture<R> $$4 = akq.a($$3, $$1, $$2, ac.f(), this.c);
      this.c.c($$4::isDone);
      return $$4.get();
   }

   private void a(ena.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      wi $$4;
      wi $$5;
      if ($$1) {
         $$4 = wi.c("selectWorld.backupQuestion.customized");
         $$5 = wi.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = wi.c("selectWorld.backupQuestion.experimental");
         $$5 = wi.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new fik($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            foo.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fby $$0, fom $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fip($$5, wi.c("selectWorld.warning.experimental.title"), wi.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fip($$5, wi.c("selectWorld.warning.deprecated.title"), wi.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.d(new fjd(wi.c("selectWorld.data_read")));
      ena.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(ena.c $$0, Runnable $$1) {
      this.c.d(new fjd(wi.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      enb $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (tz | uf | IOException var10) {
         this.c.a(new fjw(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         axk.b();
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

   private void a(ena.c $$0, enb $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new fij($$3, wi.c("selectWorld.incompatible.title").b(-65536), wi.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         enb.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            ww $$7 = wi.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            wi $$8 = wi.a($$6, $$1.k(), aa.b().c());
            this.c.a(new fik(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  foo.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(ena.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.d(new fjd(wi.c("selectWorld.resource_load")));
      asp $$4 = ass.a($$0);

      akr $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);
      } catch (Exception var8) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var8);
         if (!$$2) {
            this.c.a(new fiu(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new fij($$3, wi.c("datapackFailure.safeMode.failed.title"), wi.c("datapackFailure.safeMode.failed.description"), wh.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(ena.c $$0, akr $$1, asp $$2, Runnable $$3) {
      eng $$4 = $$1.d();
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

   private void b(ena.c $$0, akr $$1, asp $$2, Runnable $$3) {
      goh $$4 = this.c.ae();
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

   private void a(ena.c $$0, akr $$1, goh $$2, asp $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new fip($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, wi.c("selectWorld.warning.lowDiskSpace.title").a(n.m), wi.c("selectWorld.warning.lowDiskSpace.description"), wh.j, wh.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(ena.c $$0, akr $$1, asp $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(goh $$0, ena.c $$1) {
      Path $$2 = $$1.a(emy.k);
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
      this.c.a(new fip($$0::complete, wi.c("multiplayer.texturePrompt.failure.line1"), wi.c("multiplayer.texturePrompt.failure.line2"), wh.i, wh.e));
      return $$0;
   }
}
