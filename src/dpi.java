import com.mojang.serialization.MapCodec;

public class dpi extends dlg {
   public static final MapCodec<dpi> a = b(dpi::new);
   private static final fbs[] b = new fbs[]{
      djk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djk.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dpi> a() {
      return a;
   }

   public dpi(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected dgf d() {
      return cwr.vf;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b[this.h($$0)];
   }
}
