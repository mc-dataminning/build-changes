import com.mojang.serialization.Codec;

public class dyx extends dyu<ebc> {
   public dyx(Codec<ebc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyw<ebc> $$0) {
      im $$1 = $$0.e();
      ebc $$2 = $$0.f();
      dap $$3 = $$0.b();
      im.a $$4 = new im.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.I_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).i()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
