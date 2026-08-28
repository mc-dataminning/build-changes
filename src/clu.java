import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class clu extends bvx<clr> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public clu() {
      super(Map.of(cdi.o, cdj.a, cdi.aU, cdj.b, cdi.aZ, cdj.c, cdi.ba, cdj.c, cdi.aV, cdj.b, cdi.m, cdj.b, cdi.bb, cdj.c), 200);
   }

   public static boolean a(arg $$0, clr $$1) {
      if (!$$1.aH() && !$$1.bi()) {
         return false;
      } else if (byr.a($$1)) {
         return false;
      } else if ($$1.dX().a(cdi.ba, cdj.a)) {
         return true;
      } else {
         buf $$2 = $$1.dX().c(cdi.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dX().b(cdi.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            je $$3 = a($$1, clt.a($$2, $$1.dV()));
            if ($$3 == null) {
               return false;
            } else {
               dua $$4 = $$0.a_($$3.e());
               if ($$1.ao().a($$4)) {
                  return false;
               } else if (!clt.a($$1, $$3.b()) && !clt.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.dX().a(cdi.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arg $$0, clr $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arg $$0, clr $$1, long $$2) {
      return $$1.av() != bur.a && !$$1.dX().a(cdi.aU);
   }

   protected void b(arg $$0, clr $$1, long $$2) {
      if ($$1.dX().a(cdi.aZ, cdj.b)) {
         $$1.dX().a(cdi.aZ, bah.a, (long)f);
      }

      $$1.b(bur.r);
      $$0.a(null, $$1, awd.cE, awe.f, 1.0F, 1.0F);
      $$1.dX().c(cdi.ba).ifPresent($$1x -> $$1.a(ff.a.b, $$1x.b()));
   }

   protected void c(arg $$0, clr $$1, long $$2) {
      boolean $$3 = $$1.bi();
      if (!$$3 && $$1.dX().a(cdi.bb, cdj.a)) {
         $$1.dX().b(cdi.bb);
      }

      if (a($$1)) {
         eye $$4 = $$1.dX().c(cdi.ba).flatMap($$1x -> a($$1, $$1.dV(), eye.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bur.a);
            return;
         }

         if ($$3) {
            $$1.dX().a(cdi.bb, bah.a);
         }

         $$1.a(awd.cK, 1.0F, 1.0F);
         $$1.b(bur.g);
         $$1.v($$1.aU);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awd.cL, 1.0F, 1.0F);
         $$1.b(bur.a);
         $$1.r(false);
         boolean $$5 = $$1.dX().a(cdi.x);
         $$1.dX().a(cdi.aU, bah.a, $$5 ? 2L : 10L);
         $$1.dX().a(cdi.aV, bah.a, 100L);
      }
   }

   protected void d(arg $$0, clr $$1, long $$2) {
      if ($$1.av() == bur.g || $$1.av() == bur.r) {
         $$1.b(bur.a);
      }

      $$1.dX().b(cdi.ba);
      $$1.dX().b(cdi.aZ);
      $$1.dX().b(cdi.bb);
   }

   private static boolean a(clr $$0) {
      return $$0.dX().c(cdi.aZ).isEmpty() && $$0.av() == bur.r;
   }

   private static boolean b(clr $$0) {
      boolean $$1 = $$0.av() == bur.g;
      boolean $$2 = $$0.aH();
      boolean $$3 = $$0.bi() && $$0.dX().a(cdi.bb, cdj.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static je a(buf $$0, eye $$1) {
      dda $$2 = new dda($$1, $$1.a(jj.a, 10.0), dda.a.a, dda.b.a, $$0);
      eyc $$3 = $$0.dS().a($$2);
      if ($$3.c() == eyc.a.b) {
         return je.a((jx)$$3.e()).d();
      } else {
         dda $$4 = new dda($$1, $$1.a(jj.b, 10.0), dda.a.a, dda.b.a, $$0);
         eyc $$5 = $$0.dS().a($$4);
         return $$5.c() == eyc.a.b ? je.a((jx)$$5.e()).d() : null;
      }
   }

   private static boolean a(clr $$0, buf $$1) {
      return !$$1.a($$0, $$0.h(bvm.m));
   }

   private static boolean b(clr $$0, buf $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arg $$0, clr $$1) {
      je $$2 = $$1.ds();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         je $$4 = $$2.a(jj.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(awy.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<eye> a(clr $$0, azk $$1, eye $$2) {
      for (int $$4 : ad.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bvm.m);
         Optional<eye> $$6 = bxb.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
