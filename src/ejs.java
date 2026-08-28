import com.mojang.serialization.Codec;

public class ejs extends ekk<emw> {
   public ejs(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      iv $$1 = $$0.e();
      dkw $$2 = $$0.b();
      azx $$3 = $$0.d();
      if ($$1.v() > $$2.P() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dne.J) && !$$2.a_($$1.e()).a(dne.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jb $$5 : jb.values()) {
            if ($$5 != jb.a && $$2.a_($$1.a($$5)).a(dne.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dne.nC.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  iv $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  ebe $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dne.J) || $$10.a(dne.je) || $$10.a(dne.ee)) {
                     for (jb $$11 : jb.values()) {
                        ebe $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dne.nC)) {
                           $$2.a($$9, dne.nC.m(), 2);
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
