import com.mojang.serialization.Codec;

public class ean extends eat<ecu> {
   public ean(Codec<ecu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ecu> $$0) {
      ecu $$1 = $$0.f();
      iz $$2 = $$0.e();
      dco $$3 = $$0.b();
      azc $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      iz.a $$10 = new iz.a();

      for (iz $$11 : iz.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(ecu $$0, dco $$1, azc $$2, int $$3, int $$4, iz.a $$5) {
      boolean $$6 = false;

      for (int $$7 = $$3; $$7 > $$4; $$7--) {
         $$5.q($$7);
         if ($$0.b().test($$1, $$5)) {
            drx $$8 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$8, 2);
            this.a($$1, $$5);
            $$6 = true;
         }
      }

      return $$6;
   }
}
