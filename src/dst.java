import com.mojang.serialization.MapCodec;

public class dst extends dno {
   public static final MapCodec<dst> a = b(dst::new);
   private static final fgw b = dno.b(16.0, 0.0, 14.0);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   public dst(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return fgt.b();
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.b();
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 0.2F;
   }
}
