import javax.annotation.Nullable;

public class cuz extends csd {
   protected cuz(dfd.d $$0) {
      super($$0);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dee($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.v, $$0.B ? dee::a : dee::b);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      dcq $$4 = $$1.c_($$2);
      if ($$4 instanceof dee) {
         int $$5 = ((dee)$$4).g();

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

            $$1.a(ix.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return cja.b;
   }

   @Override
   public boolean a(dfe $$0, eag $$1) {
      return false;
   }
}
