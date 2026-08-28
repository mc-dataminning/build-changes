import com.mojang.serialization.Codec;

public class eja extends eit<ele> {
   public eja(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      djo $$1 = $$0.b();
      iu $$2 = $$0.e();
      azt $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         dzo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dlw.ei) && !$$4.a(dlw.el) && !$$4.a(dlw.pV)) {
            return false;
         } else {
            $$1.a($$2, dlw.ep.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               iu $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (ja $$8 : ja.values()) {
                     if ($$1.a_($$6.a($$8)).a(dlw.ep)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dlw.ep.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
