import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgz extends brh<cgw> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cgz() {
      super(Map.of(bys.o, byt.a, bys.aU, byt.b, bys.aZ, byt.c, bys.ba, byt.c, bys.aV, byt.b, bys.m, byt.b, bys.bb, byt.c), 200);
   }

   protected boolean a(apf $$0, cgw $$1) {
      if (!$$1.aC() && !$$1.bc()) {
         return false;
      } else if (bub.a($$1)) {
         return false;
      } else if ($$1.dP().a(bys.ba, byt.a)) {
         return true;
      } else {
         bpp $$2 = $$1.dP().c(bys.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dP().b(bys.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            ib $$3 = a($$1, cgy.a($$2, $$1.ei()));
            if ($$3 == null) {
               return false;
            } else if (!cgy.a($$1, $$3.b()) && !cgy.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dP().a(bys.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(apf $$0, cgw $$1, long $$2) {
      return $$1.ap() != bqa.a && !$$1.dP().a(bys.aU);
   }

   protected void b(apf $$0, cgw $$1, long $$2) {
      if ($$1.dP().a(bys.aZ, byt.b)) {
         $$1.dP().a(bys.aZ, axy.a, (long)f);
      }

      $$1.b(bqa.r);
      $$0.a(null, $$1, aty.cD, atz.f, 1.0F, 1.0F);
      $$1.dP().c(bys.ba).ifPresent($$1x -> $$1.a(eg.a.b, $$1x.b()));
   }

   protected void c(apf $$0, cgw $$1, long $$2) {
      boolean $$3 = $$1.bc();
      if (!$$3 && $$1.dP().a(bys.bb, byt.a)) {
         $$1.dP().b(bys.bb);
      }

      if (a($$1)) {
         ept $$4 = $$1.dP().c(bys.ba).flatMap($$1x -> a($$1, $$1.ei(), ept.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bqa.a);
            return;
         }

         if ($$3) {
            $$1.dP().a(bys.bb, axy.a);
         }

         $$1.a(aty.cJ, 1.0F, 1.0F);
         $$1.b(bqa.g);
         $$1.r($$1.aX);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(aty.cK, 1.0F, 1.0F);
         $$1.b(bqa.a);
         $$1.p(false);
         boolean $$5 = $$1.dP().a(bys.x);
         $$1.dP().a(bys.aU, axy.a, $$5 ? 2L : 10L);
         $$1.dP().a(bys.aV, axy.a, 100L);
      }
   }

   protected void d(apf $$0, cgw $$1, long $$2) {
      if ($$1.ap() == bqa.g || $$1.ap() == bqa.r) {
         $$1.b(bqa.a);
      }

      $$1.dP().b(bys.ba);
      $$1.dP().b(bys.aZ);
      $$1.dP().b(bys.bb);
   }

   private static boolean a(cgw $$0) {
      return $$0.dP().c(bys.aZ).isEmpty() && $$0.ap() == bqa.r;
   }

   private static boolean b(cgw $$0) {
      boolean $$1 = $$0.ap() == bqa.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.bc() && $$0.dP().a(bys.bb, byt.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static ib a(bpp $$0, ept $$1) {
      cwk $$2 = new cwk($$1, $$1.a(ih.a, 10.0), cwk.a.a, cwk.b.a, $$0);
      epr $$3 = $$0.dM().a($$2);
      if ($$3.c() == epr.a.b) {
         return ib.a($$3.e()).c();
      } else {
         cwk $$4 = new cwk($$1, $$1.a(ih.b, 10.0), cwk.a.a, cwk.b.a, $$0);
         epr $$5 = $$0.dM().a($$4);
         return $$5.c() == epr.a.b ? ib.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cgw $$0, bpp $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cgw $$0, bpp $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(apf $$0, cgw $$1) {
      ib $$2 = $$1.dm();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         ib $$4 = $$2.a(ih.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(aus.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ept> a(cgw $$0, axd $$1, ept $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<ept> $$5 = bsl.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
