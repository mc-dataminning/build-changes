import com.mojang.serialization.Codec;

public class dop extends dnl<dqg> {
   public dop(Codec<dqg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dqg> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         dqg $$3 = $$0.f();
         art $$4 = $$0.d();
         czf $$5 = czf.b();
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

         gv $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, csl.qH.n(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            gv $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), hb.b)) {
               $$1.a($$14, csl.qI.n().a(cze.c, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(cpl $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      if ($$2.b() instanceof cza) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(csl.G) || !$$2.u().b()) ? false : hb.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
