import com.mojang.serialization.Codec;

public class dvm extends dvs<dxt> {
   public dvm(Codec<dxt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvu<dxt> $$0) {
      dxt $$1 = $$0.f();
      ib $$2 = $$0.e();
      cxw $$3 = $$0.b();
      axd $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      ib.a $$10 = new ib.a();

      for (ib $$11 : ib.a($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(dxt $$0, cxw $$1, axd $$2, int $$3, int $$4, ib.a $$5) {
      boolean $$6 = false;

      for (int $$7 = $$3; $$7 > $$4; $$7--) {
         $$5.q($$7);
         if ($$0.b().test($$1, $$5)) {
            dnb $$8 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$8, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
