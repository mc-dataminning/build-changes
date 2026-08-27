import com.mojang.serialization.Codec;

public class dtv extends dts<dwa> {
   public dtv(Codec<dwa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwa> $$0) {
      hz $$1 = $$0.e();
      dwa $$2 = $$0.f();
      cwi $$3 = $$0.b();
      hz.a $$4 = new hz.a();

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
