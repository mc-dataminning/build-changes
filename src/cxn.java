import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxn extends cum {
   public static final MapCodec<cxn> a = b(cxn::new);

   @Override
   public MapCodec<cxn> a() {
      return a;
   }

   protected cxn(dhh.d $$0) {
      super($$0);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.v, $$0.B ? dgs::a : dgs::b);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      dfd $$4 = $$1.c_($$2);
      if ($$4 instanceof dgs) {
         int $$5 = ((dgs)$$4).g();

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

            $$1.a(js.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return clj.b;
   }

   @Override
   public boolean a(dhi $$0, ecr $$1) {
      return false;
   }
}
