import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhu extends det {
   public static final MapCodec<dhu> a = b(dhu::new);

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   protected dhu(dsj.d $$0) {
      super($$0);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new drg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.v, $$0.B ? drg::a : drg::b);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      dpp $$4 = $$1.c_($$2);
      if ($$4 instanceof drg) {
         int $$5 = ((drg)$$4).f();

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
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return cuc.l;
   }

   @Override
   protected boolean a(dsk $$0, eog $$1) {
      return false;
   }
}
