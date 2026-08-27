import com.mojang.serialization.Codec;

public class ebf extends dzz<ecn> {
   public ebf(Codec<ecn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecn> $$0) {
      boolean $$1 = false;
      aym $$2 = $$0.d();
      dbu $$3 = $$0.b();
      io $$4 = $$0.e();
      ecn $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dwv.a.d, $$4.u() + $$6, $$4.w() + $$7);
      io $$9 = new io($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dec.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         drd $$11 = $$10 ? dec.bx.n() : dec.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               drd $$12 = $$11.a(dmg.d, drz.a);
               io $$13 = $$9.c();
               if ($$3.a_($$13).a(dec.G)) {
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
