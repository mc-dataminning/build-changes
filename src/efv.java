import com.mojang.serialization.Codec;

public class efv extends eep<ehd> {
   public efv(Codec<ehd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eer<ehd> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      dgd $$3 = $$0.b();
      jh $$4 = $$0.e();
      ehd $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ebj.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jh $$9 = new jh($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dil.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dvo $$11 = $$10 ? dil.bx.m() : dil.bw.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dvo $$12 = $$11.b(dqp.d, dwj.a);
               jh $$13 = $$9.d();
               if ($$3.a_($$13).a(dil.G)) {
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
