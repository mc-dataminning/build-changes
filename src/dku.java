import com.mojang.serialization.MapCodec;

public class dku extends ddk {
   public static final MapCodec<dku> n = b(dku::new);

   @Override
   public MapCodec<dku> a() {
      return n;
   }

   public dku(dph.d $$0) {
      super($$0, () -> dmq.c);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new doh($$0, $$1);
   }

   @Override
   protected auv<ajv> c() {
      return auz.i.b(auz.ai);
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return axm.a(dmv.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$3 == ij.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
