import com.mojang.serialization.Codec;

public class ekb extends ejy<emg> {
   public ekb(Codec<emg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emg> $$0) {
      iv $$1 = $$0.e();
      emg $$2 = $$0.f();
      dkl $$3 = $$0.b();
      iv.a $$4 = new iv.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$1.u() + $$5;
            int $$8 = $$1.w() + $$6;
            int $$9 = $$3.G_() + $$2.b;
            $$4.d($$7, $$9, $$8);
            if ($$3.a_($$4).l()) {
               $$3.a($$4, $$2.c, 2);
            }
         }
      }

      return true;
   }
}
