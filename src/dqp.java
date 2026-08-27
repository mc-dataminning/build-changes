import com.mojang.serialization.Codec;

public class dqp extends dpj<drx> {
   public dqp(Codec<drx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpl<drx> $$0) {
      boolean $$1 = false;
      ato $$2 = $$0.d();
      csm $$3 = $$0.b();
      ht $$4 = $$0.e();
      drx $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dmf.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ht $$9 = new ht($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cuv.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dgw $$11 = $$10 ? cuv.bx.o() : cuv.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dgw $$12 = $$11.a(dcy.d, dhs.a);
               ht $$13 = $$9.c();
               if ($$3.a_($$13).a(cuv.G)) {
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
