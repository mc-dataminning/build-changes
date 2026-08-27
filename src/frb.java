import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;

public class frb implements fqp.a {
   private final eqn a;
   private double b = Double.MIN_VALUE;
   private List<big> c = Collections.emptyList();

   public frb(eqn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(elh $$0, fng $$1, double $$2, double $$3, double $$4) {
      double $$5 = (double)ac.c();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         big $$6 = this.a.j.m().g();
         this.c = ImmutableList.copyOf($$6.dK().a_($$6, $$6.cG().g(16.0)));
      }

      cbl $$7 = this.a.t;
      if ($$7 != null && $$7.aD.isPresent()) {
         this.a($$0, $$1, $$2, $$3, $$4, $$7, () -> 0.0, 1.0F, 0.0F, 0.0F);
      }

      for (big $$8 : this.c) {
         if ($$8 != $$7) {
            this.a($$0, $$1, $$2, $$3, $$4, $$8, () -> this.a($$8), 0.0F, 1.0F, 0.0F);
         }
      }
   }

   private void a(elh $$0, fng $$1, double $$2, double $$3, double $$4, big $$5, DoubleSupplier $$6, float $$7, float $$8, float $$9) {
      $$5.aD.ifPresent($$10 -> {
         double $$11 = $$6.getAsDouble();
         gv $$12 = $$5.aH();
         this.a($$12, $$0, $$2, $$3, $$4, $$1, 0.02 + $$11, $$7, $$8, $$9);
         gv $$13 = $$5.aF();
         if (!$$13.equals($$12)) {
            this.a($$13, $$0, $$2, $$3, $$4, $$1, 0.04 + $$11, 0.0F, 1.0F, 1.0F);
         }
      });
   }

   private double a(big $$0) {
      return 0.02 * (double)(String.valueOf((double)$$0.ah() + 0.132453657).hashCode() % 1000) / 1000.0;
   }

   private void a(gv $$0, elh $$1, double $$2, double $$3, double $$4, fng $$5, double $$6, float $$7, float $$8, float $$9) {
      double $$10 = (double)$$0.u() - $$2 - 2.0 * $$6;
      double $$11 = (double)$$0.v() - $$3 - 2.0 * $$6;
      double $$12 = (double)$$0.w() - $$4 - 2.0 * $$6;
      double $$13 = $$10 + 1.0 + 4.0 * $$6;
      double $$14 = $$11 + 1.0 + 4.0 * $$6;
      double $$15 = $$12 + 1.0 + 4.0 * $$6;
      fne.a($$1, $$5.getBuffer(fno.x()), $$10, $$11, $$12, $$13, $$14, $$15, $$7, $$8, $$9, 0.4F);
      fne.a(
         $$1,
         $$5.getBuffer(fno.x()),
         this.a.s.a_($$0).b(this.a.s, $$0, ehk.a()).a((double)$$0.u(), (double)$$0.v(), (double)$$0.w()),
         -$$2,
         -$$3,
         -$$4,
         $$7,
         $$8,
         $$9,
         1.0F,
         false
      );
   }
}
