import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhr extends den {
   public static final MapCodec<dhr> a = b(dhr::new);

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.w, $$0.C ? drx::a : drx::b);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      dqc $$4 = $$1.c_($$2);
      if ($$4 instanceof drx) {
         int $$5 = ((drx)$$4).f();

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

            $$1.a(lb.aa, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return cuh.i;
   }

   @Override
   protected boolean a(dtc $$0, epd $$1) {
      return false;
   }
}
