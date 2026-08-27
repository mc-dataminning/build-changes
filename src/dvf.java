import com.mojang.serialization.Codec;

public class dvf extends dtz<dwn> {
   public dvf(Codec<dwn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dwn> $$0) {
      boolean $$1 = false;
      awp $$2 = $$0.d();
      cwm $$3 = $$0.b();
      hz $$4 = $$0.e();
      dwn $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dqv.a.d, $$4.u() + $$6, $$4.w() + $$7);
      hz $$9 = new hz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cyu.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dlj $$11 = $$10 ? cyu.bx.o() : cyu.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dlj $$12 = $$11.a(dgx.d, dmf.a);
               hz $$13 = $$9.c();
               if ($$3.a_($$13).a(cyu.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
