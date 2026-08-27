import com.mojang.serialization.MapCodec;

public class dji extends dbl {
   public static final MapCodec<dji> c = b(dji::new);

   @Override
   public MapCodec<dji> a() {
      return c;
   }

   public dji(doy.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dca.a.n();
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(doz $$0) {
      return $$0.a(avc.aT);
   }

   @Override
   protected boolean f(doz $$0) {
      return true;
   }
}
