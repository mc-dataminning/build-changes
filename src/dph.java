import com.mojang.serialization.MapCodec;

public class dph extends dke {
   public static final MapCodec<dph> a = b(dph::new);
   private static final fcr b = dke.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   public dph(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return fco.b();
   }

   @Override
   protected fcr c(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.b();
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return 0.2F;
   }
}
