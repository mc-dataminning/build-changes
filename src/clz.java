import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class clz extends bwc<clw> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public clz() {
      super(Map.of(cdn.o, cdo.a, cdn.aU, cdo.b, cdn.aZ, cdo.c, cdn.ba, cdo.c, cdn.aV, cdo.b, cdn.m, cdo.b, cdn.bb, cdo.c), 200);
   }

   public static boolean a(arh $$0, clw $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (byw.a($$1)) {
         return false;
      } else if ($$1.dX().a(cdn.ba, cdo.a)) {
         return true;
      } else {
         buk $$2 = $$1.dX().c(cdn.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dX().b(cdn.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            je $$3 = a($$1, cly.a($$2, $$1.dV()));
            if ($$3 == null) {
               return false;
            } else {
               duo $$4 = $$0.a_($$3.e());
               if ($$1.ao().a($$4)) {
                  return false;
               } else if (!cly.a($$1, $$3.b()) && !cly.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dX().a(cdn.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arh $$0, clw $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arh $$0, clw $$1, long $$2) {
      return $$1.av() != buw.a && !$$1.dX().a(cdn.aU);
   }

   protected void b(arh $$0, clw $$1, long $$2) {
      if ($$1.dX().a(cdn.aZ, cdo.b)) {
         $$1.dX().a(cdn.aZ, bai.a, (long)f);
      }

      $$1.b(buw.r);
      $$0.a(null, $$1, awe.cE, awf.f, 1.0F, 1.0F);
      $$1.dX().c(cdn.ba).ifPresent($$1x -> $$1.a(ff.a.b, $$1x.b()));
   }

   protected void c(arh $$0, clw $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.dX().a(cdn.bb, cdo.a)) {
         $$1.dX().b(cdn.bb);
      }

      if (a($$1)) {
         eys $$4 = $$1.dX().c(cdn.ba).flatMap($$1x -> a($$1, $$1.dV(), eys.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(buw.a);
            return;
         }

         if ($$3) {
            $$1.dX().a(cdn.bb, bai.a);
         }

         $$1.a(awe.cK, 1.0F, 1.0F);
         $$1.b(buw.g);
         $$1.v($$1.aT);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awe.cL, 1.0F, 1.0F);
         $$1.b(buw.a);
         $$1.r(false);
         boolean $$5 = $$1.dX().a(cdn.x);
         $$1.dX().a(cdn.aU, bai.a, $$5 ? 2L : 10L);
         $$1.dX().a(cdn.aV, bai.a, 100L);
      }
   }

   protected void d(arh $$0, clw $$1, long $$2) {
      if ($$1.av() == buw.g || $$1.av() == buw.r) {
         $$1.b(buw.a);
      }

      $$1.dX().b(cdn.ba);
      $$1.dX().b(cdn.aZ);
      $$1.dX().b(cdn.bb);
   }

   private static boolean a(clw $$0) {
      return $$0.dX().c(cdn.aZ).isEmpty() && $$0.av() == buw.r;
   }

   private static boolean b(clw $$0) {
      boolean $$1 = $$0.av() == buw.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.dX().a(cdn.bb, cdo.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static je a(buk $$0, eys $$1) {
      ddo $$2 = new ddo($$1, $$1.a(jj.a, 10.0), ddo.a.a, ddo.b.a, $$0);
      eyq $$3 = $$0.dS().a($$2);
      if ($$3.d() == eyq.a.b) {
         return je.a((jx)$$3.g()).d();
      } else {
         ddo $$4 = new ddo($$1, $$1.a(jj.b, 10.0), ddo.a.a, ddo.b.a, $$0);
         eyq $$5 = $$0.dS().a($$4);
         return $$5.d() == eyq.a.b ? je.a((jx)$$5.g()).d() : null;
      }
   }

   private static boolean a(clw $$0, buk $$1) {
      return !$$1.a($$0, $$0.h(bvr.m));
   }

   private static boolean b(clw $$0, buk $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arh $$0, clw $$1) {
      je $$2 = $$1.ds();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         je $$4 = $$2.a(jj.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(awz.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eys> a(clw $$0, azl $$1, eys $$2) {
      for (int $$4 : ad.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bvr.m);
         Optional<eys> $$6 = bxg.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
