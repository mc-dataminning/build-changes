import com.mojang.serialization.MapCodec;

public class djf extends dlg {
   public static final MapCodec<djf> a = b(djf::new);
   public static final int b = 3;
   public static final dxu c = dxl.av;
   private static final fbs[] g = new fbs[]{
      djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected dxu b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dgf d() {
      return cwr.wl;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dgg $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return g[this.h($$0)];
   }
}
