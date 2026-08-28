import com.mojang.serialization.MapCodec;

public class dma extends dnc {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<? extends dma> a() {
      return a;
   }

   public dma(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      if (!$$0.C) {
         iv $$4 = $$2.b();
         $$0.a(null, $$4, awp.E, awq.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
