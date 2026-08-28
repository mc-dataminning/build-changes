import com.mojang.serialization.MapCodec;

public class dga extends dhd {
   public static final MapCodec<dga> a = b(dga::new);
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
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected dcf d() {
      return cug.uf;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b[this.g($$0)];
   }
}
