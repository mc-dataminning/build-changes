import com.mojang.serialization.MapCodec;

public class dta extends dmj {
   public static final MapCodec<dta> a = b(dta::new);
   public static final int b = 2;
   public static final dyu c = dyl.ar;
   private static final float g = 3.0F;
   private static final fcs[] h = new fcs[]{dkm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dkm.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   public dta(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   public fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dyu b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dhh d() {
      return cxt.vY;
   }

   @Override
   public dxv b(int $$0) {
      return $$0 == 2 ? dko.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dhi $$0) {
      return 1;
   }
}
