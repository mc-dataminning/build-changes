import java.util.function.Consumer;

public class cyd extends czw {
   public cyd(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(ddv $$0) {
      jc $$1 = $$0.k();
      if ($$1 == jc.a) {
         return but.d;
      } else {
         djz $$2 = $$0.q();
         ddt $$3 = new ddt($$0);
         iw $$4 = $$3.a();
         daa $$5 = $$0.n();
         ffs $$6 = ffs.c($$4);
         ffn $$7 = bxe.g.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof aru $$8) {
               Consumer<cnt> $$9 = bxe.a($$8, $$5, $$0.o());
               cnt $$10 = bxe.g.b($$8, $$9, $$4, bxd.m, true, true);
               if ($$10 == null) {
                  return but.d;
               }

               float $$11 = (float)azq.d((azq.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), awr.aD, aws.e, 0.75F, 0.8F);
               $$10.a(egg.t, $$0.o());
            }

            $$5.h(1);
            return but.a;
         } else {
            return but.d;
         }
      }
   }
}
