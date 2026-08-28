import com.mojang.serialization.MapCodec;

public class dma extends doc {
   public static final MapCodec<dma> a = b(dma::new);
   public static final int b = 3;
   public static final ebh c = eax.av;
   private static final ffk[] g = dmf.a(3, $$0 -> dmf.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   public dma(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ebh b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected diz d() {
      return czh.ww;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dja $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return g[this.h($$0)];
   }
}
