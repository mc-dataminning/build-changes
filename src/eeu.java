import com.mojang.serialization.Codec;

public class eeu extends edq<egl> {
   public eeu(Codec<egl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egl> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         egl $$3 = $$0.f();
         azl $$4 = $$0.d();
         dof $$5 = dof.b();
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

         je $$11 = $$2.e();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, dhl.qU.o(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            je $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).l() && $$1.a_($$14.e()).c($$1, $$14.e(), jj.b)) {
               $$1.a($$14, dhl.qV.o().b(doe.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(deh $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      if ($$2.b() instanceof doa) {
         return true;
      } else {
         return !$$2.l() && (!$$2.a(dhl.G) || !$$2.y().b()) ? false : jj.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).m($$0, $$1x));
      }
   }
}
