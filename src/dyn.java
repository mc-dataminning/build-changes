import com.mojang.serialization.Codec;

public class dyn extends dzd<ebo> {
   public dyn(Codec<ebo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebo> $$0) {
      in $$1 = $$0.e();
      day $$2 = $$0.b();
      ayg $$3 = $$0.d();
      if ($$1.v() > $$2.z_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(ddg.G) && !$$2.a_($$1.d()).a(ddg.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (is $$5 : is.values()) {
            if ($$5 != is.a && $$2.a_($$1.a($$5)).a(ddg.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, ddg.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  in $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dqh $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(ddg.G) || $$10.a(ddg.iC) || $$10.a(ddg.dO)) {
                     for (is $$11 : is.values()) {
                        dqh $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(ddg.mW)) {
                           $$2.a($$9, ddg.mW.n(), 2);
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
