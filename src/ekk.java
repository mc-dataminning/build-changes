import com.mojang.serialization.Codec;

public class ekk extends eje<els> {
   public ekk(Codec<els> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<els> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      dju $$3 = $$0.b();
      iu $$4 = $$0.e();
      els $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(efy.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iu $$9 = new iu($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dmc.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dzz $$11 = $$10 ? dmc.bF.m() : dmc.bE.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dzz $$12 = $$11.b(duo.d, eav.a);
               iu $$13 = $$9.d();
               if ($$3.a_($$13).a(dmc.J)) {
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
