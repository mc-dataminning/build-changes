import com.mojang.serialization.Codec;

public class eez extends eel<egw> {
   public eez(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egw> $$0) {
      int $$1 = 0;
      dfy $$2 = $$0.b();
      jh $$3 = $$0.e();
      azs $$4 = $$0.d();
      int $$5 = $$2.a(ebf.a.d, $$3.u(), $$3.w());
      jh $$6 = new jh($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dig.G)) {
         dvj $$7 = dig.mc.m();
         dvj $$8 = dig.md.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dig.G) && $$2.a_($$6.d()).a(dig.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dmh.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jh $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dig.mc)) {
                  $$2.a($$11, $$7.b(dmh.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
