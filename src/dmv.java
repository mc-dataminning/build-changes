import com.mojang.serialization.Codec;

public class dmv extends dnl<dpw> {
   public dmv(Codec<dpw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpw> $$0) {
      gv $$1 = $$0.e();
      cqe $$2 = $$0.b();
      art $$3 = $$0.d();
      if ($$1.v() > $$2.t_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(csl.G) && !$$2.a_($$1.d()).a(csl.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (hb $$5 : hb.values()) {
            if ($$5 != hb.a && $$2.a_($$1.a($$5)).a(csl.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, csl.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  gv $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dey $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(csl.G) || $$10.a(csl.iC) || $$10.a(csl.dO)) {
                     for (hb $$11 : hb.values()) {
                        dey $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(csl.mW)) {
                           $$2.a($$9, csl.mW.n(), 2);
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
