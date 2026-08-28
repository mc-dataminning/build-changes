import com.mojang.serialization.MapCodec;

public class dss extends dmb {
   public static final MapCodec<dss> a = b(dss::new);
   public static final int b = 2;
   public static final dym c = dyd.ar;
   private static final float g = 3.0F;
   private static final fcm[] h = new fcm[]{dke.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dke.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   public fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dym b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgz d() {
      return cxo.vY;
   }

   @Override
   public dxn b(int $$0) {
      return $$0 == 2 ? dkg.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dha $$0) {
      return 1;
   }
}
