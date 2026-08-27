import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdh extends bnw<cdf> {
   private static final int c = 4;
   private static final double d = 50.0;
   private static final int e = 10;
   private static final int f = 2;
   private static final int g = Math.round(10.0F);
   private static final float h = 1.4F;
   private static final ObjectArrayList<Integer> i = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cdh() {
      super(Map.of(bvh.o, bvi.a, bvh.aT, bvi.b, bvh.aY, bvi.c, bvh.aZ, bvi.c, bvh.aU, bvi.b, bvh.m, bvi.b), 200);
   }

   protected boolean a(amz $$0, cdf $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if ($$1.dO().a(bvh.aZ, bvi.a)) {
         return true;
      } else {
         bmf $$2 = $$1.dO().c(bvh.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bvh.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hx $$3 = a((bmf)$$1, a($$2, $$1.eg()));
            if ($$3 == null) {
               return false;
            } else if (!a($$1, $$3.b()) && !a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bvh.aZ, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(amz $$0, cdf $$1, long $$2) {
      return $$1.ap() != bmr.a && !$$1.dO().a(bvh.aT);
   }

   protected void b(amz $$0, cdf $$1, long $$2) {
      if ($$1.dO().a(bvh.aY, bvi.b)) {
         $$1.dO().a(bvh.aY, avm.a, (long)g);
      }

      $$1.b(bmr.r);
      $$1.dO().c(bvh.aZ).ifPresent($$1x -> $$1.a(ee.a.b, $$1x.b()));
   }

   protected void c(amz $$0, cdf $$1, long $$2) {
      if (a($$1)) {
         elm $$3 = $$1.dO().c(bvh.aZ).flatMap($$1x -> a($$1, $$1.eg(), elm.c($$1x))).orElse(null);
         if ($$3 == null) {
            $$1.b(bmr.a);
            return;
         }

         $$1.a(arm.co, 1.0F, 1.0F);
         $$1.b(bmr.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$3);
      } else if (b($$1)) {
         $$1.a(arm.cp, 1.0F, 1.0F);
         $$1.b(bmr.a);
         $$1.p(false);
         boolean $$4 = $$1.dO().a(bvh.x);
         $$1.dO().a(bvh.aT, avm.a, $$4 ? 2L : 10L);
         $$1.dO().a(bvh.aU, avm.a, 100L);
      }
   }

   protected void d(amz $$0, cdf $$1, long $$2) {
      if ($$1.ap() == bmr.g || $$1.ap() == bmr.r) {
         $$1.b(bmr.a);
      }

      $$1.dO().b(bvh.aZ);
      $$1.dO().b(bvh.aY);
   }

   private static boolean a(cdf $$0) {
      return $$0.dO().c(bvh.aY).isEmpty() && $$0.ap() == bmr.r;
   }

   private static boolean b(cdf $$0) {
      return $$0.ap() == bmr.g && $$0.aC();
   }

   private static elm a(bmf $$0, aup $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = aui.i($$1.i(), 4.0F, 8.0F);
      elm $$5 = elm.a(0.0F, $$3).a((double)$$4);
      return $$0.dk().e($$5);
   }

   @Nullable
   private static hx a(bmf $$0, elm $$1) {
      csr $$2 = new csr($$1, $$1.a(ic.a, 10.0), csr.a.a, csr.b.a, $$0);
      elk $$3 = $$0.dM().a($$2);
      if ($$3.c() == elk.a.b) {
         return hx.a($$3.e()).c();
      } else {
         csr $$4 = new csr($$1, $$1.a(ic.b, 10.0), csr.a.a, csr.b.a, $$0);
         elk $$5 = $$0.dM().a($$4);
         return $$5.c() == elk.a.b ? hx.a($$3.e()).c() : null;
      }
   }

   @VisibleForTesting
   public static boolean a(cdf $$0, elm $$1) {
      elm $$2 = new elm($$0.dr(), $$0.dt(), $$0.dx());
      return $$1.f($$2) > 50.0 ? false : $$0.dM().a(new csr($$2, $$1, csr.a.a, csr.b.a, $$0)).c() == elk.a.a;
   }

   private static boolean a(cdf $$0, bmf $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cdf $$0, bmf $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(amz $$0, cdf $$1) {
      hx $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hx $$4 = $$2.a(ic.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(asg.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<elm> a(cdf $$0, aup $$1, elm $$2) {
      for (int $$4 : ac.a(i, $$1)) {
         Optional<elm> $$5 = bpa.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
