import com.mojang.serialization.MapCodec;

public class dry extends dvy {
   public static final MapCodec<dry> a = b(dry::new);
   private static final ffr b = dmm.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   public dry(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(axc.aO) || $$0.a(dmo.eo) || super.b($$0, $$1, $$2);
   }
}
