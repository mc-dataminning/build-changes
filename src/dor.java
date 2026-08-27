import com.mojang.serialization.Codec;

public class dor extends dnl<dpz> {
   public dor(Codec<dpz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpz> $$0) {
      boolean $$1 = false;
      art $$2 = $$0.d();
      cqe $$3 = $$0.b();
      gv $$4 = $$0.e();
      dpz $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dkh.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gv $$9 = new gv($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(csl.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dey $$11 = $$10 ? csl.bx.n() : csl.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dey $$12 = $$11.a(dar.b, dfu.a);
               gv $$13 = $$9.c();
               if ($$3.a_($$13).a(csl.G)) {
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
