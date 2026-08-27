import com.mojang.serialization.MapCodec;

public class dhp extends dba {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final int b = 2;
   public static final dne c = dmu.aq;
   private static final float g = 3.0F;
   private static final epo[] h = new epo[]{czf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), czf.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   public epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dne b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cwd d() {
      return cpt.ve;
   }

   @Override
   public dme b(int $$0) {
      return $$0 == 2 ? czh.bS.o() : super.b($$0);
   }

   @Override
   public void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cwe $$0) {
      return 1;
   }
}
