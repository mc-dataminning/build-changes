import com.mojang.serialization.MapCodec;

public class dst extends dlz {
   public static final MapCodec<dst> a = b(dst::new);
   public static final int b = 2;
   public static final dyn c = dye.at;
   private static final float g = 3.0F;
   private static final fcl[] h = new fcl[]{dkd.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dkd.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   public dst(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   public fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dyn b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgy d() {
      return cxk.wi;
   }

   @Override
   public dxo b(int $$0) {
      return $$0 == 2 ? dkf.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgz $$0) {
      return 1;
   }
}
