import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbb extends cya {
   public static final MapCodec<dbb> a = b(dbb::new);

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   protected dbb(dle.d $$0) {
      super($$0);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dki($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.v, $$0.B ? dki::a : dki::b);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      dit $$4 = $$1.c_($$2);
      if ($$4 instanceof dki) {
         int $$5 = ((dki)$$4).g();

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

            $$1.a(jz.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return coz.h;
   }

   @Override
   protected boolean a(dlf $$0, ego $$1) {
      return false;
   }
}
