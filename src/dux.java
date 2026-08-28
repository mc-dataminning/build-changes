import com.mojang.serialization.MapCodec;

public class dux extends dnw {
   public static final MapCodec<dux> a = b(dux::new);
   public static final int b = 1;
   public static final eaz c = eap.at;
   private static final ffc[] g = dma.a(1, $$0 -> dma.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dux> a() {
      return a;
   }

   public dux(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   public ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected eaz b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected diu d() {
      return czc.wo;
   }

   @Override
   public dzz b(int $$0) {
      return $$0 == 2 ? dmc.ca.m() : super.b($$0);
   }

   @Override
   public void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(div $$0) {
      return 1;
   }
}
