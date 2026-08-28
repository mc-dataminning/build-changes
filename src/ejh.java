import com.mojang.serialization.Codec;

public class ejh extends ejy<emj> {
   public ejh(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emj> $$0) {
      iv $$1 = $$0.e();
      dkl $$2 = $$0.b();
      azv $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dmt.J) && !$$2.a_($$1.e()).a(dmt.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jb $$5 : jb.values()) {
            if ($$5 != jb.a && $$2.a_($$1.a($$5)).a(dmt.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dmt.nC.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iv $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  eat $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dmt.J) || $$10.a(dmt.je) || $$10.a(dmt.ee)) {
                     for (jb $$11 : jb.values()) {
                        eat $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dmt.nC)) {
                           $$2.a($$9, dmt.nC.m(), 2);
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
