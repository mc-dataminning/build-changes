import com.mojang.serialization.MapCodec;

public class djx extends dey {
   public static final MapCodec<djx> a = b(djx::new);
   protected static final ewj b = dey.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected ewj b_(dsb $$0, dbd $$1, iz $$2) {
      return ewg.b();
   }

   @Override
   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.b();
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected float d(dsb $$0, dbd $$1, iz $$2) {
      return 0.2F;
   }
}
