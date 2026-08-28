import com.mojang.serialization.MapCodec;

public class dsv extends dma {
   public static final MapCodec<dsv> a = b(dsv::new);
   public static final int b = 1;
   public static final dyq c = dyg.at;
   private static final fcr[] g = dke.a(1, $$0 -> dke.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dsv> a() {
      return a;
   }

   public dsv(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   public fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected dyq b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgy d() {
      return cxl.wk;
   }

   @Override
   public dxq b(int $$0) {
      return $$0 == 2 ? dkg.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgz $$0) {
      return 1;
   }
}
