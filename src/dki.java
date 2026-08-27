import com.mojang.serialization.Codec;

public class dki extends dko<dmp> {
   public dki(Codec<dmp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmp> $$0) {
      dmp $$1 = $$0.f();
      gu $$2 = $$0.e();
      cng $$3 = $$0.b();
      apf $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      gu.a $$10 = new gu.a();

      for (gu $$11 : gu.a($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(dmp $$0, cng $$1, apf $$2, int $$3, int $$4, gu.a $$5) {
      boolean $$6 = false;
      dcb $$7 = null;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dcb $$9 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$9, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
