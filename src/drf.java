import com.mojang.serialization.Codec;

public class drf extends drc<dtk> {
   public drf(Codec<dtk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtk> $$0) {
      hv $$1 = $$0.e();
      dtk $$2 = $$0.f();
      ctt $$3 = $$0.b();
      hv.a $$4 = new hv.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.J_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).i()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
