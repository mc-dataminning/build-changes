import com.mojang.serialization.MapCodec;

public class dsz extends dmi {
   public static final MapCodec<dsz> a = b(dsz::new);
   public static final int b = 2;
   public static final dyt c = dyk.ar;
   private static final float g = 3.0F;
   private static final fcr[] h = new fcr[]{dkl.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dkl.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dsz> a() {
      return a;
   }

   public dsz(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   public fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dyt b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dhg d() {
      return cxs.vY;
   }

   @Override
   public dxu b(int $$0) {
      return $$0 == 2 ? dkn.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhh $$0) {
      return 1;
   }
}
