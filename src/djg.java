import com.mojang.serialization.MapCodec;

public class djg extends dlh {
   public static final MapCodec<djg> a = b(djg::new);
   public static final int b = 3;
   public static final dxv c = dxm.av;
   private static final fbt[] g = new fbt[]{
      djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected dxv b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgg d() {
      return cws.wl;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgh $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return g[this.h($$0)];
   }
}
