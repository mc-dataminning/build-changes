import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdn extends boc<cdl> {
   private static final int c = 4;
   private static final double d = 50.0;
   private static final int e = 10;
   private static final int f = 2;
   private static final int g = Math.round(10.0F);
   private static final float h = 1.4F;
   private static final ObjectArrayList<Integer> i = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cdn() {
      super(Map.of(bvn.o, bvo.a, bvn.aT, bvo.b, bvn.aY, bvo.c, bvn.aZ, bvo.c, bvn.aU, bvo.b, bvn.m, bvo.b), 200);
   }

   protected boolean a(and $$0, cdl $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if ($$1.dO().a(bvn.aZ, bvo.a)) {
         return true;
      } else {
         bml $$2 = $$1.dO().c(bvn.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dO().b(bvn.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hx $$3 = a((bml)$$1, a($$2, $$1.eg()));
            if ($$3 == null) {
               return false;
            } else if (!a($$1, $$3.b()) && !a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dO().a(bvn.aZ, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(and $$0, cdl $$1, long $$2) {
      return $$1.ap() != bmx.a && !$$1.dO().a(bvn.aT);
   }

   protected void b(and $$0, cdl $$1, long $$2) {
      if ($$1.dO().a(bvn.aY, bvo.b)) {
         $$1.dO().a(bvn.aY, avs.a, (long)g);
      }

      $$1.b(bmx.r);
      $$1.dO().c(bvn.aZ).ifPresent($$1x -> $$1.a(ee.a.b, $$1x.b()));
   }

   protected void c(and $$0, cdl $$1, long $$2) {
      if (a($$1)) {
         elt $$3 = $$1.dO().c(bvn.aZ).flatMap($$1x -> a($$1, $$1.eg(), elt.c($$1x))).orElse(null);
         if ($$3 == null) {
            $$1.b(bmx.a);
            return;
         }

         $$1.a(ars.co, 1.0F, 1.0F);
         $$1.b(bmx.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$3);
      } else if (b($$1)) {
         $$1.a(ars.cp, 1.0F, 1.0F);
         $$1.b(bmx.a);
         $$1.p(false);
         boolean $$4 = $$1.dO().a(bvn.x);
         $$1.dO().a(bvn.aT, avs.a, $$4 ? 2L : 10L);
         $$1.dO().a(bvn.aU, avs.a, 100L);
      }
   }

   protected void d(and $$0, cdl $$1, long $$2) {
      if ($$1.ap() == bmx.g || $$1.ap() == bmx.r) {
         $$1.b(bmx.a);
      }

      $$1.dO().b(bvn.aZ);
      $$1.dO().b(bvn.aY);
   }

   private static boolean a(cdl $$0) {
      return $$0.dO().c(bvn.aY).isEmpty() && $$0.ap() == bmx.r;
   }

   private static boolean b(cdl $$0) {
      return $$0.ap() == bmx.g && $$0.aC();
   }

   private static elt a(bml $$0, auv $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = auo.i($$1.i(), 4.0F, 8.0F);
      elt $$5 = elt.a(0.0F, $$3).a((double)$$4);
      return $$0.dk().e($$5);
   }

   @Nullable
   private static hx a(bml $$0, elt $$1) {
      csy $$2 = new csy($$1, $$1.a(ic.a, 10.0), csy.a.a, csy.b.a, $$0);
      elr $$3 = $$0.dM().a($$2);
      if ($$3.c() == elr.a.b) {
         return hx.a($$3.e()).c();
      } else {
         csy $$4 = new csy($$1, $$1.a(ic.b, 10.0), csy.a.a, csy.b.a, $$0);
         elr $$5 = $$0.dM().a($$4);
         return $$5.c() == elr.a.b ? hx.a($$3.e()).c() : null;
      }
   }

   @VisibleForTesting
   public static boolean a(cdl $$0, elt $$1) {
      elt $$2 = new elt($$0.dr(), $$0.dt(), $$0.dx());
      return $$1.f($$2) > 50.0 ? false : $$0.dM().a(new csy($$2, $$1, csy.a.a, csy.b.a, $$0)).c() == elr.a.a;
   }

   private static boolean a(cdl $$0, bml $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cdl $$0, bml $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(and $$0, cdl $$1) {
      hx $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hx $$4 = $$2.a(ic.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(asm.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<elt> a(cdl $$0, auv $$1, elt $$2) {
      for (int $$4 : ac.a(i, $$1)) {
         Optional<elt> $$5 = bpg.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
