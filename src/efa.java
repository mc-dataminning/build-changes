import com.mojang.serialization.Codec;

public class efa extends edu<egi> {
   public efa(Codec<egi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egi> $$0) {
      boolean $$1 = false;
      azn $$2 = $$0.d();
      dfg $$3 = $$0.b();
      jf $$4 = $$0.e();
      egi $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(eao.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jf $$9 = new jf($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dho.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dus $$11 = $$10 ? dho.bx.n() : dho.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dus $$12 = $$11.b(dpt.d, dvo.a);
               jf $$13 = $$9.d();
               if ($$3.a_($$13).a(dho.G)) {
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
