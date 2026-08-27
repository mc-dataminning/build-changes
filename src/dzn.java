import com.mojang.serialization.Codec;

public class dzn extends dye<eap> {
   public dzn(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      id.a $$3 = new id.a();
      id.a $$4 = new id.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dva.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ij.a, 1);
            daf $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dcj.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dcj.dN.n(), 2);
               dpi $$11 = $$1.a_($$4);
               if ($$11.b(djq.c)) {
                  $$1.a($$4, $$11.a(djq.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
