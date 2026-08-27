import com.mojang.serialization.Codec;

public class dsz extends drt<duh> {
   public dsz(Codec<duh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duh> $$0) {
      boolean $$1 = false;
      auu $$2 = $$0.d();
      cuj $$3 = $$0.b();
      hx $$4 = $$0.e();
      duh $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dop.a.d, $$4.u() + $$6, $$4.w() + $$7);
      hx $$9 = new hx($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cwr.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         djg $$11 = $$10 ? cwr.bx.o() : cwr.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               djg $$12 = $$11.a(deu.d, dkc.a);
               hx $$13 = $$9.c();
               if ($$3.a_($$13).a(cwr.G)) {
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
