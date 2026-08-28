import com.mojang.serialization.MapCodec;

public class dqc extends dma {
   public static final MapCodec<dqc> a = b(dqc::new);
   private static final fcr[] b = dke.a(7, $$0 -> dke.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected dgy d() {
      return cxl.vh;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b[this.h($$0)];
   }
}
