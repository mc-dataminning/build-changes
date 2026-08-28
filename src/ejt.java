import com.mojang.serialization.Codec;

public class ejt extends ejm<elx> {
   public ejt(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         eah $$4 = $$1.a_($$2.d());
         if (!$$4.a(dmh.em) && !$$4.a(dmh.ep) && !$$4.a(dmh.pZ)) {
            return false;
         } else {
            $$1.a($$2, dmh.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iu $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (ja $$8 : ja.values()) {
                     if ($$1.a_($$6.a($$8)).a(dmh.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dmh.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
