import com.mojang.serialization.MapCodec;

public class dpt extends dkw {
   public static final MapCodec<dpt> a = b(dpt::new);
   protected static final fcs b = dkm.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(axu.aO) || $$0.a(dko.ek) || super.b($$0, $$1, $$2);
   }
}
