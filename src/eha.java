import com.mojang.serialization.Codec;

public class eha extends ehr<ekc> {
   public eha(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      jj $$1 = $$0.e();
      dio $$2 = $$0.b();
      azs $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dkw.J) && !$$2.a_($$1.e()).a(dkw.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jo $$5 : jo.values()) {
            if ($$5 != jo.a && $$2.a_($$1.a($$5)).a(dkw.ja)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dkw.ny.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jj $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dym $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dkw.J) || $$10.a(dkw.ja) || $$10.a(dkw.eb)) {
                     for (jo $$11 : jo.values()) {
                        dym $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dkw.ny)) {
                           $$2.a($$9, dkw.ny.m(), 2);
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
