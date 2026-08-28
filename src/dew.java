import com.mojang.serialization.MapCodec;

public class dew extends dgw {
   public static final MapCodec<dew> a = b(dew::new);
   public static final int b = 3;
   public static final dte c = dsu.as;
   private static final ewm[] g = new ewm[]{
      dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public dew(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected dte b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dbz d() {
      return cuu.vl;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dca $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return g[this.g($$0)];
   }
}
