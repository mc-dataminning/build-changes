import com.mojang.serialization.Codec;

public class dmx extends dnn<dpy> {
   public dmx(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpy> $$0) {
      gu $$1 = $$0.e();
      cqg $$2 = $$0.b();
      aru $$3 = $$0.d();
      if ($$1.v() > $$2.t_() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(csn.G) && !$$2.a_($$1.d()).a(csn.G)) {
         return false;
      } else {
         boolean $$4 = false;

         for (ha $$5 : ha.values()) {
            if ($$5 != ha.a && $$2.a_($$1.a($$5)).a(csn.iC)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, csn.mW.n(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  gu $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  dfa $$10 = $$2.a_($$9);
                  if ($$10.i() || $$10.a(csn.G) || $$10.a(csn.iC) || $$10.a(csn.dO)) {
                     for (ha $$11 : ha.values()) {
                        dfa $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(csn.mW)) {
                           $$2.a($$9, csn.mW.n(), 2);
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
