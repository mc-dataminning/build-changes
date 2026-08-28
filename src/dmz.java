import com.mojang.serialization.MapCodec;

public class dmz extends dvy {
   public static final MapCodec<dmz> a = b(dmz::new);
   private static final ffr b = dmm.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dmz> a() {
      return a;
   }

   public dmz(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      eao $$3 = $$1.a_($$2);
      return $$3.a(dmo.eg) || $$3.a($$1, $$2, jb.b, dux.b);
   }
}
