import com.mojang.serialization.MapCodec;

public class dcc extends dec {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final int b = 3;
   public static final dqi c = dpy.as;
   private static final etc[] g = new etc[]{
      dch.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dcc(dph.d $$0) {
      super($$0);
   }

   @Override
   protected dqi b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected czf d() {
      return crv.vj;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(czg $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return g[this.g($$0)];
   }
}
