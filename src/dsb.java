import com.mojang.serialization.MapCodec;

public class dsb extends dlh {
   public static final MapCodec<dsb> a = b(dsb::new);
   public static final int b = 2;
   public static final dxv c = dxm.at;
   private static final float g = 3.0F;
   private static final fbt[] h = new fbt[]{djl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), djl.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dsb> a() {
      return a;
   }

   public dsb(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   public fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dxv b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgg d() {
      return cws.wi;
   }

   @Override
   public dww b(int $$0) {
      return $$0 == 2 ? djn.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgh $$0) {
      return 1;
   }
}
