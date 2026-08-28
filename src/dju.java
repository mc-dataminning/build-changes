import com.mojang.serialization.MapCodec;

public class dju extends djw {
   public static final MapCodec<dju> a = b(dju::new);
   private static final fcs b = dkm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dju> a() {
      return a;
   }

   protected dju(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return b;
   }
}
