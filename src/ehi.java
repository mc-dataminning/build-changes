import com.mojang.serialization.Codec;

public class ehi extends efz<eik> {
   public ehi(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eik> $$0) {
      dhh $$1 = $$0.b();
      ji $$2 = $$0.e();
      ji.a $$3 = new ji.a();
      ji.a $$4 = new ji.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(ect.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jn.a, 1);
            dhl $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, djp.eb.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, djp.ea.m(), 2);
               dwy $$11 = $$1.a_($$4);
               if ($$11.b(drc.c)) {
                  $$1.a($$4, $$11.b(drc.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
