import com.mojang.serialization.MapCodec;

public class dbr extends cxu {
   public static final MapCodec<dbr> a = b(dbr::new);
   private static final elu[] b = new elu[]{
      cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(dio.d $$0) {
      super($$0);
   }

   @Override
   protected csx d() {
      return cmk.tZ;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b[this.g($$0)];
   }
}
