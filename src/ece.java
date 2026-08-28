import com.mojang.serialization.Codec;

public class ece extends eba<edv> {
   public ece(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edv> $$0) {
      dcv $$1 = $$0.b();
      iz $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         edv $$3 = $$0.f();
         azh $$4 = $$0.d();
         dlw $$5 = dlw.b();
         int $$6 = $$3.f() + $$3.d();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            for (int $$8 = 0; $$8 < $$3.a(); $$8++) {
               $$5.a($$2, $$3.b());
            }

            boolean $$9 = $$7 < $$3.f();

            for (int $$10 = 0; $$10 < $$3.c(); $$10++) {
               $$5.a($$1, $$2, $$4, $$9);
            }

            $$5.j();
         }

         iz $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, dfd.qU.o(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            iz $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), je.b)) {
               $$1.a($$14, dfd.qV.o().a(dlv.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dcb $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dlr) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(dfd.G) || !$$2.u().b()) ? false : je.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
