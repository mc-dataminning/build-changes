import com.mojang.serialization.Codec;

public class dyl extends dye<eap> {
   public dyl(Codec<eap> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<eap> $$0) {
      dab $$1 = $$0.b();
      id $$2 = $$0.e();
      axt $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dpi $$4 = $$1.a_($$2.c());
         if (!$$4.a(dcj.dV) && !$$4.a(dcj.dY) && !$$4.a(dcj.pr)) {
            return false;
         } else {
            $$1.a($$2, dcj.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               id $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ij $$8 : ij.values()) {
                     if ($$1.a_($$6.a($$8)).a(dcj.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dcj.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
