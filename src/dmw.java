import com.mojang.serialization.MapCodec;

public class dmw extends dvy implements dmp {
   public static final MapCodec<dmw> a = b(dmw::new);
   private static final ffr b = dmm.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   protected dmw(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return dmp.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      dmp.a((djh)$$0, $$2, $$3).ifPresent($$1x -> $$0.b($$1x, this.m()));
   }
}
