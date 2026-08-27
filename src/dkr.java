import com.mojang.serialization.Codec;

public class dkr extends dko<dmw> {
   public dkr(Codec<dmw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmw> $$0) {
      gu $$1 = $$0.e();
      dmw $$2 = $$0.f();
      cng $$3 = $$0.b();
      gu.a $$4 = new gu.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.C_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).i()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
