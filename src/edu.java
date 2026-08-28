import com.mojang.serialization.Codec;

public class edu extends eel<egw> {
   public edu(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egw> $$0) {
      jh $$1 = $$0.e();
      dfy $$2 = $$0.b();
      azs $$3 = $$0.d();
      if ($$1.v() > $$2.N() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dig.G) && !$$2.a_($$1.e()).a(dig.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$2.a_($$1.a($$5)).a(dig.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dig.mW.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jh $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dvj $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dig.G) || $$10.a(dig.iC) || $$10.a(dig.dO)) {
                     for (jm $$11 : jm.values()) {
                        dvj $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dig.mW)) {
                           $$2.a($$9, dig.mW.m(), 2);
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
