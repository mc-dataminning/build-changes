import com.mojang.serialization.Codec;

public class dqd extends dqa<dsi> {
   public dqd(Codec<dsi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsi> $$0) {
      hx $$1 = $$0.e();
      dsi $$2 = $$0.f();
      csz $$3 = $$0.b();
      hx.a $$4 = new hx.a();

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
