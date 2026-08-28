import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmv extends bwy<cms> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cmv() {
      super(Map.of(cej.o, cek.a, cej.aU, cek.b, cej.aZ, cek.c, cej.ba, cek.c, cej.aV, cek.b, cej.m, cek.b, cej.bb, cek.c), 200);
   }

   public static boolean a(arc $$0, cms $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (bzs.a($$1)) {
         return false;
      } else if ($$1.ec().a(cej.ba, cek.a)) {
         return true;
      } else {
         bvf $$2 = $$1.ec().c(cej.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cej.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            ji $$3 = a($$1, cmu.a($$2, $$1.dZ()));
            if ($$3 == null) {
               return false;
            } else {
               dwv $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cmu.a($$1, $$3.b()) && !cmu.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cej.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arc $$0, cms $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arc $$0, cms $$1, long $$2) {
      return $$1.aw() != bvr.a && !$$1.ec().a(cej.aU);
   }

   protected void b(arc $$0, cms $$1, long $$2) {
      if ($$1.ec().a(cej.aZ, cek.b)) {
         $$1.ec().a(cej.aZ, bae.a, (long)f);
      }

      $$1.b(bvr.r);
      $$0.a(null, $$1, avz.cE, awa.f, 1.0F, 1.0F);
      $$1.ec().c(cej.ba).ifPresent($$1x -> $$1.a(fj.a.b, $$1x.b()));
   }

   protected void c(arc $$0, cms $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.ec().a(cej.bb, cek.a)) {
         $$1.ec().b(cej.bb);
      }

      if (a($$1)) {
         fay $$4 = $$1.ec().c(cej.ba).flatMap($$1x -> a($$1, $$1.dZ(), fay.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvr.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cej.bb, bae.a);
         }

         $$1.a(avz.cK, 1.0F, 1.0F);
         $$1.b(bvr.g);
         $$1.v($$1.aX);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(avz.cL, 1.0F, 1.0F);
         $$1.b(bvr.a);
         $$1.r(false);
         boolean $$5 = $$1.ec().a(cej.x);
         $$1.ec().a(cej.aU, bae.a, $$5 ? 2L : 10L);
         $$1.ec().a(cej.aV, bae.a, 100L);
      }
   }

   protected void d(arc $$0, cms $$1, long $$2) {
      if ($$1.aw() == bvr.g || $$1.aw() == bvr.r) {
         $$1.b(bvr.a);
      }

      $$1.ec().b(cej.ba);
      $$1.ec().b(cej.aZ);
      $$1.ec().b(cej.bb);
   }

   private static boolean a(cms $$0) {
      return $$0.ec().c(cej.aZ).isEmpty() && $$0.aw() == bvr.r;
   }

   private static boolean b(cms $$0) {
      boolean $$1 = $$0.aw() == bvr.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.ec().a(cej.bb, cek.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ji a(bvf $$0, fay $$1) {
      dfo $$2 = new dfo($$1, $$1.a(jn.a, 10.0), dfo.a.a, dfo.b.a, $$0);
      faw $$3 = $$0.dW().a($$2);
      if ($$3.d() == faw.a.b) {
         return ji.a((kb)$$3.g()).d();
      } else {
         dfo $$4 = new dfo($$1, $$1.a(jn.b, 10.0), dfo.a.a, dfo.b.a, $$0);
         faw $$5 = $$0.dW().a($$4);
         return $$5.d() == faw.a.b ? ji.a((kb)$$5.g()).d() : null;
      }
   }

   private static boolean a(cms $$0, bvf $$1) {
      return !$$1.a($$0, $$0.h(bwn.m));
   }

   private static boolean b(cms $$0, bvf $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arc $$0, cms $$1) {
      ji $$2 = $$1.dw();
      if ($$0.a_($$2).a(djm.pI)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            ji $$4 = $$2.a(jn.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(awu.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fay> a(cms $$0, azg $$1, fay $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwn.m);
         Optional<fay> $$6 = byc.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(btq.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fk();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
