import com.mojang.serialization.Codec;

public class doi extends doo<dqp> {
   public doi(Codec<dqp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<dqp> $$0) {
      dqp $$1 = $$0.f();
      ht $$2 = $$0.e();
      crt $$3 = $$0.b();
      ate $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      ht.a $$10 = new ht.a();

      for (ht $$11 : ht.a($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(dqp $$0, crt $$1, ate $$2, int $$3, int $$4, ht.a $$5) {
      boolean $$6 = false;

      for (int $$7 = $$3; $$7 > $$4; $$7--) {
         $$5.q($$7);
         if ($$0.b().test($$1, $$5)) {
            dgb $$8 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$8, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
