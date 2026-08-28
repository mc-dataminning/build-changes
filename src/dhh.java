import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhh extends deg {
   public static final MapCodec<dhh> a = b(dhh::new);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(drw.d $$0) {
      super($$0);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.v, $$0.B ? dqs::a : dqs::b);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      dpc $$4 = $$1.c_($$2);
      if ($$4 instanceof dqs) {
         int $$5 = ((dqs)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(lj.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return cuk.l;
   }

   @Override
   protected boolean a(drx $$0, enp $$1) {
      return false;
   }
}
