import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhm extends del {
   public static final MapCodec<dhm> a = b(dhm::new);

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   protected dhm(dsb.d $$0) {
      super($$0);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.v, $$0.B ? dqx::a : dqx::b);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      dph $$4 = $$1.c_($$2);
      if ($$4 instanceof dqx) {
         int $$5 = ((dqx)$$4).f();

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

            $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return cup.l;
   }

   @Override
   protected boolean a(dsc $$0, enu $$1) {
      return false;
   }
}
