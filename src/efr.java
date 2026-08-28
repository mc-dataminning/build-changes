import com.mojang.serialization.Codec;

public class efr extends eel<egz> {
   public efr(Codec<egz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egz> $$0) {
      boolean $$1 = false;
      azs $$2 = $$0.d();
      dfy $$3 = $$0.b();
      jh $$4 = $$0.e();
      egz $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ebf.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jh $$9 = new jh($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dig.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dvj $$11 = $$10 ? dig.bx.m() : dig.bw.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dvj $$12 = $$11.b(dqk.d, dwf.a);
               jh $$13 = $$9.d();
               if ($$3.a_($$13).a(dig.G)) {
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
