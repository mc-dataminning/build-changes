import com.mojang.serialization.Codec;

public class ehy extends ehr<ekc> {
   public ehy(Codec<ekc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ekc> $$0) {
      dio $$1 = $$0.b();
      jj $$2 = $$0.e();
      azs $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dym $$4 = $$1.a_($$2.d());
         if (!$$4.a(dkw.ei) && !$$4.a(dkw.el) && !$$4.a(dkw.pV)) {
            return false;
         } else {
            $$1.a($$2, dkw.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jj $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jo $$8 : jo.values()) {
                     if ($$1.a_($$6.a($$8)).a(dkw.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dkw.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
