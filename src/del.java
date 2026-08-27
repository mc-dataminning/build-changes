import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class del extends dbk {
   public static final MapCodec<del> a = b(del::new);

   @Override
   public MapCodec<del> a() {
      return a;
   }

   protected del(doy.d $$0) {
      super($$0);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.v, $$0.B ? dnv::a : dnv::b);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      dmf $$4 = $$1.c_($$2);
      if ($$4 instanceof dnv) {
         int $$5 = ((dnv)$$4).f();

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

            $$1.a(kl.aa, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return crj.i;
   }

   @Override
   protected boolean a(doz $$0, ekr $$1) {
      return false;
   }
}
