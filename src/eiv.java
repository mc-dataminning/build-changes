import com.mojang.serialization.Codec;

public class eiv extends ehr<ekm> {
   public eiv(Codec<ekm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekm> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         ekm $$3 = $$0.f();
         azs $$4 = $$0.d();
         dru $$5 = dru.b();
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

         jj $$11 = $$2.e();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, dkw.ry.m(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            jj $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).l() && $$1.a_($$14.e()).c($$1, $$14.e(), jo.b)) {
               $$1.a($$14, dkw.rz.m().b(drt.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dhq $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      if ($$2.b() instanceof drp) {
         return true;
      } else {
         return !$$2.l() && (!$$2.a(dkw.J) || !$$2.y().b()) ? false : jo.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).m($$0, $$1x));
      }
   }
}
