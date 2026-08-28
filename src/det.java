import com.mojang.serialization.MapCodec;

public class det extends dgt {
   public static final MapCodec<det> a = b(det::new);
   public static final int b = 3;
   public static final dtb c = dsr.as;
   private static final ewj[] g = new ewj[]{
      dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected dtb b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dbw d() {
      return cur.vl;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dbx $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return g[this.g($$0)];
   }
}
