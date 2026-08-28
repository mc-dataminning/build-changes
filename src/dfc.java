import com.mojang.serialization.MapCodec;

public class dfc extends dhc {
   public static final MapCodec<dfc> a = b(dfc::new);
   public static final int b = 3;
   public static final dtk c = dta.as;
   private static final ewy[] g = new ewy[]{
      dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected dtk b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dce d() {
      return cuf.vl;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dcf $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return g[this.g($$0)];
   }
}
