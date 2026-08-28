import com.mojang.serialization.MapCodec;

public class des extends dgs {
   public static final MapCodec<des> a = b(des::new);
   public static final int b = 3;
   public static final dta c = dsq.as;
   private static final ewi[] g = new ewi[]{
      dex.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(drz.d $$0) {
      super($$0);
   }

   @Override
   protected dta b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dbv d() {
      return cuq.vl;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbw $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return g[this.g($$0)];
   }
}
