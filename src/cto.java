import java.util.function.Consumer;

public class cto extends cvn {
   public cto(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(czp $$0) {
      jk $$1 = $$0.k();
      if ($$1 == jk.a) {
         return brs.d;
      } else {
         dej $$2 = $$0.q();
         czn $$3 = new czn($$0);
         jf $$4 = $$3.a();
         cvs $$5 = $$0.n();
         eyw $$6 = eyw.c($$4);
         eyr $$7 = bty.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof arj $$8) {
               Consumer<cjw> $$9 = bty.a($$8, $$5, $$0.o());
               cjw $$10 = bty.d.b($$8, $$9, $$4, btx.m, true, true);
               if ($$10 == null) {
                  return brs.d;
               }

               float $$11 = (float)azf.d((azf.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dx(), $$10.dz(), $$10.dD(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dx(), $$10.dz(), $$10.dD(), awg.aD, awh.e, 0.75F, 0.8F);
               $$10.a(dzp.t, $$0.o());
            }

            $$5.h(1);
            return brs.a;
         } else {
            return brs.d;
         }
      }
   }
}
