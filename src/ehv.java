import com.mojang.serialization.Codec;

public class ehv extends egp<ejd> {
   public ehv(Codec<ejd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejd> $$0) {
      boolean $$1 = false;
      bac $$2 = $$0.d();
      dhx $$3 = $$0.b();
      jh $$4 = $$0.e();
      ejd $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(edj.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jh $$9 = new jh($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dkf.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dxo $$11 = $$10 ? dkf.bE.m() : dkf.bD.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dxo $$12 = $$11.b(dso.d, dyj.a);
               jh $$13 = $$9.d();
               if ($$3.a_($$13).a(dkf.J)) {
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
