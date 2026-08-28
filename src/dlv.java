import com.mojang.serialization.MapCodec;

public class dlv extends dnw {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final int b = 3;
   public static final eaz c = eap.av;
   private static final ffc[] g = dma.a(3, $$0 -> dma.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected eaz b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected diu d() {
      return czc.wr;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(div $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return g[this.h($$0)];
   }
}
