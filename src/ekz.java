import com.mojang.serialization.Codec;

public class ekz extends ekw<enf> {
   public ekz(Codec<enf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enf> $$0) {
      iw $$1 = $$0.e();
      enf $$2 = $$0.f();
      dli $$3 = $$0.b();
      iw.a $$4 = new iw.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.K_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).l()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
