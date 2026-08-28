import com.mojang.serialization.MapCodec;

public class dfd extends dhd {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final int b = 3;
   public static final dtl c = dtb.as;
   private static final exa[] g = new exa[]{
      dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public dfd(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected dtl b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dcf d() {
      return cug.vl;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcg $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return g[this.g($$0)];
   }
}
