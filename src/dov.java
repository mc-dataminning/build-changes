import com.mojang.serialization.Codec;

public class dov extends dnr<dqm> {
   public dov(Codec<dqm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqm> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         dqm $$3 = $$0.f();
         arx $$4 = $$0.d();
         czl $$5 = czl.b();
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

         gw $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, csr.qH.n(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            gw $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), hc.b)) {
               $$1.a($$14, csr.qI.n().a(czk.c, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(cpr $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      if ($$2.b() instanceof czg) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(csr.G) || !$$2.u().b()) ? false : hc.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
