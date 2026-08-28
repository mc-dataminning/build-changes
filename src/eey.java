import com.mojang.serialization.Codec;

public class eey extends edu<egp> {
   public eey(Codec<egp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egp> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         egp $$3 = $$0.f();
         azn $$4 = $$0.d();
         doi $$5 = doi.b();
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

         jf $$11 = $$2.e();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, dho.qU.n(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            jf $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).l() && $$1.a_($$14.e()).c($$1, $$14.e(), jk.b)) {
               $$1.a($$14, dho.qV.n().b(doh.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dek $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dod) {
         return true;
      } else {
         return !$$2.l() && (!$$2.a(dho.G) || !$$2.y().b()) ? false : jk.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).m($$0, $$1x));
      }
   }
}
