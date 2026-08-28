import com.mojang.serialization.MapCodec;

public class dsp extends dko implements dkh {
   public static final MapCodec<dsp> a = b(dsp::new);
   private static final fcr b = dke.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   protected dsp(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      dmn.a($$0, o($$3).m(), $$2, 2);
   }

   private static dmn o(dxq $$0) {
      return (dmn)($$0.a(dkg.bB) ? dkg.jg : dkg.jf);
   }
}
