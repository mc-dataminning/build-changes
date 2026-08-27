import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvn extends cso {
   public static final MapCodec<cvn> a = b(cvn::new);

   @Override
   public MapCodec<cvn> a() {
      return a;
   }

   protected cvn(dfc.d $$0) {
      super($$0);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new den($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.v, $$0.B ? den::a : den::b);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      dcz $$4 = $$1.c_($$2);
      if ($$4 instanceof den) {
         int $$5 = ((den)$$4).g();

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

            $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return cjl.b;
   }

   @Override
   public boolean a(dfd $$0, eaf $$1) {
      return false;
   }
}
