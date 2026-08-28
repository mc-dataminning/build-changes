import com.mojang.serialization.MapCodec;

public class djz extends dma {
   public static final MapCodec<djz> a = b(djz::new);
   public static final int b = 3;
   public static final dyq c = dyg.av;
   private static final fcr[] g = dke.a(3, $$0 -> dke.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected dyq b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgy d() {
      return cxl.wn;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return g[this.h($$0)];
   }
}
