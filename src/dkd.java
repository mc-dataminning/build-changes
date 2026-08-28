import com.mojang.serialization.MapCodec;

public class dkd extends dlg {
   public static final MapCodec<dkd> a = b(dkd::new);
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
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected dgf d() {
      return cwr.ve;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b[this.h($$0)];
   }
}
