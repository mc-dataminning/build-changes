import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdm extends bob<cdk> {
   private static final int c = 4;
   private static final double d = 50.0;
   private static final int e = 10;
   private static final int f = 2;
   private static final int g = Math.round(10.0F);
   private static final float h = 1.4F;
   private static final ObjectArrayList<Integer> i = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cdm() {
      super(Map.of(bvm.o, bvn.a, bvm.aT, bvn.b, bvm.aY, bvn.c, bvm.aZ, bvn.c, bvm.aU, bvn.b, bvm.m, bvn.b), 200);
   }

   protected boolean a(and $$0, cdk $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if ($$1.dO().a(bvm.aZ, bvn.a)) {
         return true;
      } else {
         bmk $$2 = $$1.dO().c(bvm.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bvm.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hx $$3 = a((bmk)$$1, a($$2, $$1.eg()));
            if ($$3 == null) {
               return false;
            } else if (!a($$1, $$3.b()) && !a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bvm.aZ, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(and $$0, cdk $$1, long $$2) {
      return $$1.ap() != bmw.a && !$$1.dO().a(bvm.aT);
   }

   protected void b(and $$0, cdk $$1, long $$2) {
      if ($$1.dO().a(bvm.aY, bvn.b)) {
         $$1.dO().a(bvm.aY, avr.a, (long)g);
      }

      $$1.b(bmw.r);
      $$1.dO().c(bvm.aZ).ifPresent($$1x -> $$1.a(ee.a.b, $$1x.b()));
   }

   protected void c(and $$0, cdk $$1, long $$2) {
      if (a($$1)) {
         els $$3 = $$1.dO().c(bvm.aZ).flatMap($$1x -> a($$1, $$1.eg(), els.c($$1x))).orElse(null);
         if ($$3 == null) {
            $$1.b(bmw.a);
            return;
         }

         $$1.a(arr.co, 1.0F, 1.0F);
         $$1.b(bmw.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$3);
      } else if (b($$1)) {
         $$1.a(arr.cp, 1.0F, 1.0F);
         $$1.b(bmw.a);
         $$1.p(false);
         boolean $$4 = $$1.dO().a(bvm.x);
         $$1.dO().a(bvm.aT, avr.a, $$4 ? 2L : 10L);
         $$1.dO().a(bvm.aU, avr.a, 100L);
      }
   }

   protected void d(and $$0, cdk $$1, long $$2) {
      if ($$1.ap() == bmw.g || $$1.ap() == bmw.r) {
         $$1.b(bmw.a);
      }

      $$1.dO().b(bvm.aZ);
      $$1.dO().b(bvm.aY);
   }

   private static boolean a(cdk $$0) {
      return $$0.dO().c(bvm.aY).isEmpty() && $$0.ap() == bmw.r;
   }

   private static boolean b(cdk $$0) {
      return $$0.ap() == bmw.g && $$0.aC();
   }

   private static els a(bmk $$0, auu $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = aun.i($$1.i(), 4.0F, 8.0F);
      els $$5 = els.a(0.0F, $$3).a((double)$$4);
      return $$0.dk().e($$5);
   }

   @Nullable
   private static hx a(bmk $$0, els $$1) {
      csx $$2 = new csx($$1, $$1.a(ic.a, 10.0), csx.a.a, csx.b.a, $$0);
      elq $$3 = $$0.dM().a($$2);
      if ($$3.c() == elq.a.b) {
         return hx.a($$3.e()).c();
      } else {
         csx $$4 = new csx($$1, $$1.a(ic.b, 10.0), csx.a.a, csx.b.a, $$0);
         elq $$5 = $$0.dM().a($$4);
         return $$5.c() == elq.a.b ? hx.a($$3.e()).c() : null;
      }
   }

   @VisibleForTesting
   public static boolean a(cdk $$0, els $$1) {
      els $$2 = new els($$0.dr(), $$0.dt(), $$0.dx());
      return $$1.f($$2) > 50.0 ? false : $$0.dM().a(new csx($$2, $$1, csx.a.a, csx.b.a, $$0)).c() == elq.a.a;
   }

   private static boolean a(cdk $$0, bmk $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cdk $$0, bmk $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(and $$0, cdk $$1) {
      hx $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hx $$4 = $$2.a(ic.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(asl.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<els> a(cdk $$0, auu $$1, els $$2) {
      for (int $$4 : ac.a(i, $$1)) {
         Optional<els> $$5 = bpf.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
