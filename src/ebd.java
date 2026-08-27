import com.mojang.serialization.Codec;

public class ebd extends dzz<ecu> {
   public ebd(Codec<ecu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecu> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         ecu $$3 = $$0.f();
         aym $$4 = $$0.d();
         dkv $$5 = dkv.b();
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

         io $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, dec.qU.n(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            io $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), it.b)) {
               $$1.a($$14, dec.qV.n().a(dku.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dba $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dkq) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(dec.G) || !$$2.u().b()) ? false : it.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
