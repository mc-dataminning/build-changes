import com.mojang.serialization.MapCodec;

public class dkr extends dec {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final int b = 2;
   public static final dqi c = dpy.aq;
   private static final float g = 3.0F;
   private static final etc[] h = new etc[]{dch.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dch.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dph.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   public etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dqi b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected czf d() {
      return crv.vg;
   }

   @Override
   public dpi b(int $$0) {
      return $$0 == 2 ? dcj.bS.n() : super.b($$0);
   }

   @Override
   public void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(czg $$0) {
      return 1;
   }
}
