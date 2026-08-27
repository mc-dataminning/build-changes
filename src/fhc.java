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

public class fhc {
   private static final Logger a = LogUtils.getLogger();
   private final euk b;
   private final efu c;

   public fhc(euk $$0, efu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(String $$0, ctc $$1, dow $$2, Function<is, dot> $$3, fcc $$4) {
      this.b.d(new fbi(vb.c("selectWorld.data_read")));
      efu.c $$5 = this.a($$0);
      if ($$5 != null) {
         apd $$6 = apg.a($$5);
         cts $$7 = $$1.g();

         try {
            aho.d $$8 = new aho.d($$6, $$7, false, false);
            ahp $$9 = this.a($$8, $$3x -> {
               dot.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(kc.aM));
               return new aho.b<>(new efy($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, ahp::new);
            this.b.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.a();
            this.b.a($$4);
         }
      }
   }

   @Nullable
   private efu.c a(String $$0) {
      try {
         return this.c.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         eyo.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ekq var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(fbr.a(() -> this.b.a(null)));
         return null;
      }
   }

   public void a(efu.c $$0, ahd $$1, im<ahc> $$2, ega $$3) {
      apd $$4 = apg.a($$0);
      api $$5 = (api)new aho.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0, $$4, new ahp($$5, $$1, $$2, $$3), true);
   }

   public ahp a(Dynamic<?> $$0, boolean $$1, apd $$2) throws Exception {
      aho.d $$3 = efu.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         ir<dlz> $$2x = $$1x.d().d(kc.aM);
         efr $$3x = efu.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new aho.b<>($$3x.a(), $$3x.b().b());
      }, ahp::new);
   }

   public Pair<ctc, fha> a(efu.c $$0) throws Exception {
      apd $$1 = apg.a($$0);
      Dynamic<?> $$2 = $$0.f();
      aho.d $$3 = efu.a($$2, $$1, false);

      record a(ctc a, dow b, ir<dlz> c) {
      }

      return this.a($$3, $$1x -> {
         ir<dlz> $$2x = new in<>(kc.aM, Lifecycle.stable()).l();
         efr $$3x = efu.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new aho.b<>(new a($$3x.a().L(), $$3x.a().A(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         return Pair.of($$3x.a, new fha($$3x.b, new dot($$3x.c), $$2x, $$1x, $$3x.a.g()));
      });
   }

   private <D, R> R a(aho.d $$0, aho.f<D> $$1, aho.e<D, R> $$2) throws Exception {
      aho.c $$3 = new aho.c($$0, dt.a.c, 2);
      CompletableFuture<R> $$4 = aho.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(efu.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      vb $$4;
      vb $$5;
      if ($$1) {
         $$4 = vb.c("selectWorld.backupQuestion.customized");
         $$5 = vb.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = vb.c("selectWorld.backupQuestion.experimental");
         $$5 = vb.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new faq($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            fgu.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(euk $$0, fgs $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
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
         $$0.a(new fav($$5, vb.c("selectWorld.warning.experimental.title"), vb.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new fav($$5, vb.c("selectWorld.warning.deprecated.title"), vb.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.b.d(new fbi(vb.c("selectWorld.data_read")));
      efu.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(efu.c $$0, Runnable $$1) {
      this.b.d(new fbi(vb.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      efv $$3;
      try {
         $$2 = $$0.f();
         $$3 = $$0.a($$2);
      } catch (su | ta | IOException var10) {
         this.b.a(new fcb(this.b, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.a();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         atw.b();
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
         this.b.a(new fap($$1, vb.c("selectWorld.incompatible.title").b(-65536), vb.a("selectWorld.incompatible.description", $$3.k())));
      } else {
         efv.a $$12 = $$3.o();
         if ($$12.a()) {
            String $$13 = "selectWorld.backupQuestion." + $$12.c();
            String $$14 = "selectWorld.backupWarning." + $$12.c();
            vp $$15 = vb.c($$13);
            if ($$12.b()) {
               $$15.b(-2142128);
            }

            vb $$16 = vb.a($$14, $$3.k(), aa.b().c());
            this.b.a(new faq(() -> {
               $$0.a();
               $$1.run();
            }, ($$3x, $$4) -> {
               if ($$3x) {
                  fgu.a($$0);
               }

               this.a($$0, $$2, false, true, $$1);
            }, $$15, $$16, false));
         } else {
            this.a($$0, $$2, false, true, $$1);
         }
      }
   }

   private void a(efu.c $$0, Dynamic<?> $$1, boolean $$2, boolean $$3, Runnable $$4) {
      this.b.d(new fbi(vb.c("selectWorld.resource_load")));
      apd $$5 = apg.a($$0);

      ahp $$6;
      try {
         $$6 = this.a($$1, $$2, $$5);
      } catch (Exception var11) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
         if (!$$2) {
            this.b.a(new fba(() -> {
               $$0.a();
               $$4.run();
            }, () -> this.a($$0, $$1, true, $$3, $$4)));
         } else {
            $$0.a();
            this.b.a(new fap($$4, vb.c("datapackFailure.safeMode.failed.title"), vb.c("datapackFailure.safeMode.failed.description"), va.k, true));
         }

         return;
      }

      ega $$9 = $$6.d();
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
      this.b.a(new fav($$0::complete, vb.c("multiplayer.texturePrompt.failure.line1"), vb.c("multiplayer.texturePrompt.failure.line2"), va.i, va.e));
      return $$0;
   }
}
