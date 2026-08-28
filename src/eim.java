import com.mojang.serialization.Codec;

public class eim extends eit<eku> {
   public eim(Codec<eku> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<eku> $$0) {
      eku $$1 = $$0.f();
      iu $$2 = $$0.e();
      djo $$3 = $$0.b();
      azt $$4 = $$0.d();
      boolean $$5 = false;
      int $$6 = $$2.v();
      int $$7 = $$6 + $$1.d();
      int $$8 = $$6 - $$1.d() - 1;
      int $$9 = $$1.c().a($$4);
      iu.a $$10 = new iu.a();

      for (iu $$11 : iu.c($$2.b(-$$9, 0, -$$9), $$2.b($$9, 0, $$9))) {
         int $$12 = $$11.u() - $$2.u();
         int $$13 = $$11.w() - $$2.w();
         if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
            $$5 |= this.a($$1, $$3, $$4, $$7, $$8, $$10.g($$11));
         }
      }

      return $$5;
   }

   protected boolean a(eku $$0, djo $$1, azt $$2, int $$3, int $$4, iu.a $$5) {
      boolean $$6 = false;
      boolean $$7 = false;

      for (int $$8 = $$3; $$8 > $$4; $$8--) {
         $$5.q($$8);
         if ($$0.b().test($$1, $$5)) {
            dzo $$9 = $$0.a().a($$1, $$2, $$5);
            $$1.a($$5, $$9, 2);
            if (!$$7) {
               this.a($$1, $$5);
            }

            $$6 = true;
            $$7 = true;
         } else {
            $$7 = false;
         }
      }

      return $$6;
   }
}
