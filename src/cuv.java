import com.mojang.serialization.MapCodec;

public class cuv extends cwv {
   public static final MapCodec<cuv> a = b(cuv::new);
   public static final int b = 3;
   public static final dii c = dhy.as;
   private static final ekn[] g = new ekn[]{
      cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cuv> a() {
      return a;
   }

   public cuv(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected dii b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected crz d() {
      return clm.vd;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csa $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return g[this.g($$0)];
   }
}
