import com.mojang.serialization.MapCodec;

public class dsd extends dlj {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final int b = 2;
   public static final dxx c = dxo.at;
   private static final float g = 3.0F;
   private static final fbv[] h = new fbv[]{djn.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), djn.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   public fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dxx b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgi d() {
      return cwu.wi;
   }

   @Override
   public dwy b(int $$0) {
      return $$0 == 2 ? djp.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgj $$0) {
      return 1;
   }
}
