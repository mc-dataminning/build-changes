import com.mojang.serialization.Codec;

public class eke extends ekw<eni> {
   public eke(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      iw $$1 = $$0.e();
      dli $$2 = $$0.b();
      bai $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dnq.J) && !$$2.a_($$1.e()).a(dnq.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jc $$5 : jc.values()) {
            if ($$5 != jc.a && $$2.a_($$1.a($$5)).a(dnq.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dnq.nC.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iw $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  ebq $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dnq.J) || $$10.a(dnq.je) || $$10.a(dnq.ee)) {
                     for (jc $$11 : jc.values()) {
                        ebq $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dnq.nC)) {
                           $$2.a($$9, dnq.nC.m(), 2);
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
