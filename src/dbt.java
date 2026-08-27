import com.mojang.serialization.MapCodec;

public class dbt extends ddt {
   public static final MapCodec<dbt> a = b(dbt::new);
   public static final int b = 3;
   public static final dpz c = dpp.as;
   private static final est[] g = new est[]{
      dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   public dbt(doy.d $$0) {
      super($$0);
   }

   @Override
   protected dpz b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cyw d() {
      return crm.vj;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cyx $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return g[this.g($$0)];
   }
}
