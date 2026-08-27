import javax.annotation.Nullable;

public class cut extends crx {
   protected cut(dex.d $$0) {
      super($$0);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.v, $$0.B ? ddy::a : ddy::b);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      dck $$4 = $$1.c_($$2);
      if ($$4 instanceof ddy) {
         int $$5 = ((ddy)$$4).g();

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

            $$1.a(iw.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return ciw.b;
   }

   @Override
   public boolean a(dey $$0, eaa $$1) {
      return false;
   }
}
