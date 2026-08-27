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
   private final eqp b;
   private final eca c;

   public fdd(eqp $$0, eca $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(eye $$0, String $$1) {
      try {
         this.a($$0, $$1, false, true);
      } catch (OutOfMemoryError var8) {
         arz.b();
         System.gc();
         String $$3 = "Ran out of memory trying to read level data of world folder \"" + $$1 + "\"";
         a.error(LogUtils.FATAL_MARKER, $$3);
         OutOfMemoryError $$4 = new OutOfMemoryError("Ran out of memory reading level data");
         $$4.initCause(var8);
         o $$5 = o.a($$4, $$3);
         p $$6 = $$5.a("World details");
         $$6.a("World folder", $$1);
         throw new y($$5);
      }
   }

   public void a(String $$0, cqf $$1, dlk $$2, Function<hr, dlh> $$3) {
      eca.c $$4 = this.a($$0);
      if ($$4 != null) {
         anh $$5 = ank.a($$4);
         cqu $$6 = $$1.g();

         try {
            aft.d $$7 = new aft.d($$5, $$6, false, false);
            afu $$8 = this.a($$7, $$3x -> {
               dlh.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(jc.aJ));
               return new aft.b<>(new ece($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, afu::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private eca.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         eur.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (egw var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(exu.a(null));
         return null;
      }
   }

   public void a(eca.c $$0, afj $$1, hl<afi> $$2, ecg $$3) {
      anh $$4 = ank.a($$0);
      anm $$5 = (anm)new aft.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new afu($$5, $$1, $$2, $$3), true);
   }

   private afu a(eca.c $$0, boolean $$1, anh $$2) throws Exception {
      aft.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rq> $$2x = aex.a(ri.a, $$1x.c());
         hq<din> $$3x = $$1x.d().d(jc.aJ);
         Pair<ecg, dlh.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new aft.b<>((ecg)$$4.getFirst(), ((dlh.b)$$4.getSecond()).b());
         }
      }, afu::new);
   }

   public Pair<cqf, fdb> a(eca.c $$0) throws Exception {
      anh $$1 = ank.a($$0);
      aft.d $$2 = this.b($$0, false, $$1);

      record a(cqf a, dlk b, hq<din> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rq> $$2x = aex.a(ri.a, $$1x.c());
         hq<din> $$3 = new hm<>(jc.aJ, Lifecycle.stable()).l();
         Pair<ecg, dlh.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new aft.b<>(new a(((ecg)$$4.getFirst()).L(), ((ecg)$$4.getFirst()).A(), ((dlh.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fdb($$3.b, new dlh($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private aft.d b(eca.c $$0, boolean $$1, anh $$2) {
      cqu $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new aft.d($$2, $$3, $$1, false);
      }
   }

   public afu a(eca.c $$0, boolean $$1) throws Exception {
      anh $$2 = ank.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(aft.d $$0, aft.f<D> $$1, aft.e<D, R> $$2) throws Exception {
      aft.c $$3 = new aft.c($$0, du.a.c, 2);
      CompletableFuture<R> $$4 = aft.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(eye $$0, String $$1, boolean $$2, boolean $$3) {
      eca.c $$4 = this.a($$1);
      if ($$4 != null) {
         anh $$5 = ank.a($$4);

         afu $$6;
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
                        () -> this.b.a(null), tl.c("datapackFailure.safeMode.failed.title"), tl.c("datapackFailure.safeMode.failed.description"), tk.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         ecg $$9 = $$6.d();
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
      this.b.a(new ewy($$0::complete, tl.c("multiplayer.texturePrompt.failure.line1"), tl.c("multiplayer.texturePrompt.failure.line2"), tk.i, tk.e));
      return $$0;
   }

   private static void a(eca.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(eye $$0, String $$1, boolean $$2, Runnable $$3) {
      tl $$4;
      tl $$5;
      if ($$2) {
         $$4 = tl.c("selectWorld.backupQuestion.customized");
         $$5 = tl.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = tl.c("selectWorld.backupQuestion.experimental");
         $$5 = tl.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ewt($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fcv.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(eqp $$0, fct $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new ewy($$5, tl.c("selectWorld.warning.experimental.title"), tl.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new ewy($$5, tl.c("selectWorld.warning.deprecated.title"), tl.c("selectWorld.warning.deprecated.question")));
      }
   }
}
