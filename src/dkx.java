import com.mojang.serialization.MapCodec;

public class dkx extends dma {
   public static final MapCodec<dkx> a = b(dkx::new);
   private static final fcr[] b = dke.a(7, $$0 -> dke.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected dgy d() {
      return cxl.vg;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b[this.h($$0)];
   }
}
