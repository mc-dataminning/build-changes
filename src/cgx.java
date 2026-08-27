import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgx extends brg<cgu> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cgx() {
      super(Map.of(byr.o, bys.a, byr.aU, bys.b, byr.aZ, bys.c, byr.ba, bys.c, byr.aV, bys.b, byr.m, bys.b, byr.bb, bys.c), 200);
   }

   protected boolean a(apf $$0, cgu $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bua.a($$1)) {
         return false;
      } else if ($$1.dP().a(byr.ba, bys.a)) {
         return true;
      } else {
         bpo $$2 = $$1.dP().c(byr.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dP().b(byr.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            ib $$3 = a($$1, cgw.a($$2, $$1.ei()));
            if ($$3 == null) {
               return false;
            } else if (!cgw.a($$1, $$3.b()) && !cgw.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dP().a(byr.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(apf $$0, cgu $$1, long $$2) {
      return $$1.ap() != bpz.a && !$$1.dP().a(byr.aU);
   }

   protected void b(apf $$0, cgu $$1, long $$2) {
      if ($$1.dP().a(byr.aZ, bys.b)) {
         $$1.dP().a(byr.aZ, axy.a, (long)f);
      }

      $$1.b(bpz.r);
      $$0.a(null, $$1, aty.cz, atz.f, 1.0F, 1.0F);
      $$1.dP().c(byr.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(apf $$0, cgu $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dP().a(byr.bb, bys.a)) {
         $$1.dP().b(byr.bb);
      }

      if (a($$1)) {
         epr $$4 = $$1.dP().c(byr.ba).flatMap($$1x -> a($$1, $$1.ei(), epr.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bpz.a);
            return;
         }

         if ($$3) {
            $$1.dP().a(byr.bb, axy.a);
         }

         $$1.a(aty.cF, 1.0F, 1.0F);
         $$1.b(bpz.g);
         $$1.r($$1.aX);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(aty.cG, 1.0F, 1.0F);
         $$1.b(bpz.a);
         $$1.p(false);
         boolean $$5 = $$1.dP().a(byr.x);
         $$1.dP().a(byr.aU, axy.a, $$5 ? 2L : 10L);
         $$1.dP().a(byr.aV, axy.a, 100L);
      }
   }

   protected void d(apf $$0, cgu $$1, long $$2) {
      if ($$1.ap() == bpz.g || $$1.ap() == bpz.r) {
         $$1.b(bpz.a);
      }

      $$1.dP().b(byr.ba);
      $$1.dP().b(byr.aZ);
      $$1.dP().b(byr.bb);
   }

   private static boolean a(cgu $$0) {
      return $$0.dP().c(byr.aZ).isEmpty() && $$0.ap() == bpz.r;
   }

   private static boolean b(cgu $$0) {
      boolean $$1 = $$0.ap() == bpz.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dP().a(byr.bb, bys.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ib a(bpo $$0, epr $$1) {
      cwi $$2 = new cwi($$1, $$1.a(ih.a, 10.0), cwi.a.a, cwi.b.a, $$0);
      epp $$3 = $$0.dM().a($$2);
      if ($$3.c() == epp.a.b) {
         return ib.a($$3.e()).c();
      } else {
         cwi $$4 = new cwi($$1, $$1.a(ih.b, 10.0), cwi.a.a, cwi.b.a, $$0);
         epp $$5 = $$0.dM().a($$4);
         return $$5.c() == epp.a.b ? ib.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cgu $$0, bpo $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cgu $$0, bpo $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(apf $$0, cgu $$1) {
      ib $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ib $$4 = $$2.a(ih.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(aus.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<epr> a(cgu $$0, axd $$1, epr $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<epr> $$5 = bsk.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
