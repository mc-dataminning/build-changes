import com.mojang.serialization.MapCodec;

public class cza extends dba {
   public static final MapCodec<cza> a = b(cza::new);
   public static final int b = 3;
   public static final dne c = dmu.as;
   private static final epo[] g = new epo[]{
      czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cza> a() {
      return a;
   }

   public cza(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected dne b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cwd d() {
      return cpt.vh;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cwe $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return g[this.g($$0)];
   }
}
