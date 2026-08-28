import com.mojang.serialization.MapCodec;

public class dra extends dkw {
   public static final MapCodec<dra> a = b(dra::new);
   protected static final float b = 6.0F;
   protected static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dra> a() {
      return a;
   }

   protected dra(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dko.ek) || super.b($$0, $$1, $$2);
   }
}
