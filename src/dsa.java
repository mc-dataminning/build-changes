import com.mojang.serialization.MapCodec;

public class dsa extends dlg {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final int b = 2;
   public static final dxu c = dxl.at;
   private static final float g = 3.0F;
   private static final fbs[] h = new fbs[]{djk.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), djk.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   public fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dxu b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dgf d() {
      return cwr.wi;
   }

   @Override
   public dwv b(int $$0) {
      return $$0 == 2 ? djm.bZ.m() : super.b($$0);
   }

   @Override
   public void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgg $$0) {
      return 1;
   }
}
