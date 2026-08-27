import com.mojang.serialization.Codec;

public class edl extends eca<eeu> {
   public edl(Codec<eeu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeu> $$0) {
      boolean $$1 = false;
      ayt $$2 = $$0.d();
      dcv $$3 = $$0.b();
      ir $$4 = $$0.e();
      eeu $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dyu.a.d, $$4.u() + $$6, $$4.w() + $$7);
      ir $$9 = new ir($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfe.al)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dtc $$11 = $$10 ? dfe.ch.n() : dfe.cg.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dtc $$12 = $$11.a(dnx.d, dty.a);
               ir $$13 = $$9.c();
               if ($$3.a_($$13).a(dfe.al)) {
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
