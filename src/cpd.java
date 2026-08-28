import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpd extends byv<cpa> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cpd() {
      super(Map.of(cgg.p, cgh.a, cgg.aV, cgh.b, cgg.ba, cgh.c, cgg.bb, cgh.c, cgg.aW, cgh.b, cgg.n, cgh.b, cgg.bc, cgh.c), 200);
   }

   public static boolean a(arq $$0, cpa $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cbp.a($$1)) {
         return false;
      } else if ($$1.ec().a(cgg.bb, cgh.a)) {
         return true;
      } else {
         bxe $$2 = $$1.ec().c(cgg.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ec().b(cgg.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iu $$3 = a($$1, cpc.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               eah $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cpc.a($$1, $$3.b()) && !cpc.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ec().a(cgg.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arq $$0, cpa $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arq $$0, cpa $$1, long $$2) {
      return $$1.aw() != bxq.a && !$$1.ec().a(cgg.aV);
   }

   protected void b(arq $$0, cpa $$1, long $$2) {
      if ($$1.ec().a(cgg.ba, cgh.b)) {
         $$1.ec().a(cgg.ba, bau.a, (long)f);
      }

      $$1.b(bxq.r);
      $$0.a(null, $$1, awn.cE, awo.f, 1.0F, 1.0F);
      $$1.ec().c(cgg.bb).ifPresent($$1x -> $$1.a(eu.a.b, $$1x.b()));
   }

   protected void c(arq $$0, cpa $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.ec().a(cgg.bc, cgh.a)) {
         $$1.ec().b(cgg.bc);
      }

      if (a($$1)) {
         feq $$4 = $$1.ec().c(cgg.bb).flatMap($$1x -> a($$1, $$1.dY(), feq.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bxq.a);
            return;
         }

         if ($$3) {
            $$1.ec().a(cgg.bc, bau.a);
         }

         $$1.a(awn.cK, 1.0F, 1.0F);
         $$1.b(bxq.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awn.cL, 1.0F, 1.0F);
         $$1.b(bxq.a);
         $$1.q(false);
         boolean $$5 = $$1.ec().a(cgg.y);
         $$1.ec().a(cgg.aV, bau.a, $$5 ? 2L : 10L);
         $$1.ec().a(cgg.aW, bau.a, 100L);
      }
   }

   protected void d(arq $$0, cpa $$1, long $$2) {
      if ($$1.aw() == bxq.g || $$1.aw() == bxq.r) {
         $$1.b(bxq.a);
      }

      $$1.ec().b(cgg.bb);
      $$1.ec().b(cgg.ba);
      $$1.ec().b(cgg.bc);
   }

   private static boolean a(cpa $$0) {
      return $$0.ec().c(cgg.ba).isEmpty() && $$0.aw() == bxq.r;
   }

   private static boolean b(cpa $$0) {
      boolean $$1 = $$0.aw() == bxq.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.ec().a(cgg.bc, cgh.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iu a(bxe $$0, feq $$1) {
      dij $$2 = new dij($$1, $$1.a(ja.a, 10.0), dij.a.a, dij.b.a, $$0);
      feo $$3 = $$0.dV().a($$2);
      if ($$3.d() == feo.a.b) {
         return iu.a((jo)$$3.g()).d();
      } else {
         dij $$4 = new dij($$1, $$1.a(ja.b, 10.0), dij.a.a, dij.b.a, $$0);
         feo $$5 = $$0.dV().a($$4);
         return $$5.d() == feo.a.b ? iu.a((jo)$$5.g()).d() : null;
      }
   }

   private static boolean a(cpa $$0, bxe $$1) {
      return !$$1.a($$0, $$0.h(byk.m));
   }

   private static boolean b(cpa $$0, bxe $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arq $$0, cpa $$1) {
      iu $$2 = $$1.dv();
      if ($$0.a_($$2).a(dmh.pO)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iu $$4 = $$2.a(ja.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axh.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<feq> a(cpa $$0, azv $$1, feq $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(byk.m);
         Optional<feq> $$6 = bzz.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bvl.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fi();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
