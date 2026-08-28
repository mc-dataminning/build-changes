import com.mojang.serialization.Codec;

public class eiv extends ejm<elx> {
   public eiv(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      iu $$1 = $$0.e();
      djz $$2 = $$0.b();
      azv $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dmh.J) && !$$2.a_($$1.e()).a(dmh.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ja $$5 : ja.values()) {
            if ($$5 != ja.a && $$2.a_($$1.a($$5)).a(dmh.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dmh.nC.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iu $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  eah $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dmh.J) || $$10.a(dmh.je) || $$10.a(dmh.ee)) {
                     for (ja $$11 : ja.values()) {
                        eah $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dmh.nC)) {
                           $$2.a($$9, dmh.nC.m(), 2);
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
