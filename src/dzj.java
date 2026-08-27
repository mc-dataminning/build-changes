import com.mojang.serialization.Codec;

public class dzj extends dzz<eck> {
   public dzj(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      io $$1 = $$0.e();
      dbu $$2 = $$0.b();
      aym $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dec.G) && !$$2.a_($$1.d()).a(dec.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (it $$5 : it.values()) {
            if ($$5 != it.a && $$2.a_($$1.a($$5)).a(dec.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dec.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  io $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  drd $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(dec.G) || $$10.a(dec.iC) || $$10.a(dec.dO)) {
                     for (it $$11 : it.values()) {
                        drd $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dec.mW)) {
                           $$2.a($$9, dec.mW.n(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
