import com.mojang.serialization.MapCodec;

public class dlb extends dhd {
   public static final MapCodec<dlb> a = b(dlb::new);
   private static final exa[] b = new exa[]{
      dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected dcf d() {
      return cug.ug;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b[this.g($$0)];
   }
}
