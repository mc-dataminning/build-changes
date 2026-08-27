import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ccx extends bnm<ccv> {
   private static final int c = 4;
   private static final double d = 50.0;
   private static final int e = 10;
   private static final int f = 2;
   private static final int g = Math.round(10.0F);
   private static final float h = 1.4F;
   private static final ObjectArrayList<Integer> i = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public ccx() {
      super(Map.of(bux.o, buy.a, bux.aT, buy.b, bux.aY, buy.c, bux.aZ, buy.c, bux.aU, buy.b, bux.m, buy.b), 200);
   }

   protected boolean a(amp $$0, ccv $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if ($$1.dO().a(bux.aZ, buy.a)) {
         return true;
      } else {
         blv $$2 = $$1.dO().c(bux.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bux.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hv $$3 = a((blv)$$1, a($$2, $$1.eg()));
            if ($$3 == null) {
               return false;
            } else if (!a($$1, $$3.b()) && !a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bux.aZ, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(amp $$0, ccv $$1, long $$2) {
      return $$1.ap() != bmh.a && !$$1.dO().a(bux.aT);
   }

   protected void b(amp $$0, ccv $$1, long $$2) {
      if ($$1.dO().a(bux.aY, buy.b)) {
         $$1.dO().a(bux.aY, avc.a, (long)g);
      }

      $$1.b(bmh.r);
      $$1.dO().c(bux.aZ).ifPresent($$1x -> $$1.a(ed.a.b, $$1x.b()));
   }

   protected void c(amp $$0, ccv $$1, long $$2) {
      if (a($$1)) {
         elb $$3 = $$1.dO().c(bux.aZ).flatMap($$1x -> a($$1, $$1.eg(), elb.c($$1x))).orElse(null);
         if ($$3 == null) {
            $$1.b(bmh.a);
            return;
         }

         $$1.a(arc.co, 1.0F, 1.0F);
         $$1.b(bmh.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$3);
      } else if (b($$1)) {
         $$1.a(arc.cp, 1.0F, 1.0F);
         $$1.b(bmh.a);
         $$1.p(false);
         boolean $$4 = $$1.dO().a(bux.x);
         $$1.dO().a(bux.aT, avc.a, $$4 ? 2L : 10L);
         $$1.dO().a(bux.aU, avc.a, 100L);
      }
   }

   protected void d(amp $$0, ccv $$1, long $$2) {
      if ($$1.ap() == bmh.g || $$1.ap() == bmh.r) {
         $$1.b(bmh.a);
      }

      $$1.dO().b(bux.aZ);
      $$1.dO().b(bux.aY);
   }

   private static boolean a(ccv $$0) {
      return $$0.dO().c(bux.aY).isEmpty() && $$0.ap() == bmh.r;
   }

   private static boolean b(ccv $$0) {
      return $$0.ap() == bmh.g && $$0.aC();
   }

   private static elb a(blv $$0, auf $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = aty.i($$1.i(), 4.0F, 8.0F);
      elb $$5 = elb.a(0.0F, $$3).a((double)$$4);
      return $$0.dk().e($$5);
   }

   @Nullable
   private static hv a(blv $$0, elb $$1) {
      csh $$2 = new csh($$1, $$1.a(ia.a, 10.0), csh.a.a, csh.b.a, $$0);
      ekz $$3 = $$0.dM().a($$2);
      if ($$3.c() == ekz.a.b) {
         return hv.a($$3.e()).c();
      } else {
         csh $$4 = new csh($$1, $$1.a(ia.b, 10.0), csh.a.a, csh.b.a, $$0);
         ekz $$5 = $$0.dM().a($$4);
         return $$5.c() == ekz.a.b ? hv.a($$3.e()).c() : null;
      }
   }

   @VisibleForTesting
   public static boolean a(ccv $$0, elb $$1) {
      elb $$2 = new elb($$0.dr(), $$0.dt(), $$0.dx());
      return $$1.f($$2) > 50.0 ? false : $$0.dM().a(new csh($$2, $$1, csh.a.a, csh.b.a, $$0)).c() == ekz.a.a;
   }

   private static boolean a(ccv $$0, blv $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(ccv $$0, blv $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(amp $$0, ccv $$1) {
      hv $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hv $$4 = $$2.a(ia.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(arw.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<elb> a(ccv $$0, auf $$1, elb $$2) {
      for (int $$4 : ac.a(i, $$1)) {
         Optional<elb> $$5 = boq.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
