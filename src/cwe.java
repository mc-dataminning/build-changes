import com.mojang.serialization.MapCodec;

public class cwe extends cye {
   public static final MapCodec<cwe> a = b(cwe::new);
   public static final int b = 3;
   public static final dka c = djq.as;
   private static final emf[] g = new emf[]{
      cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(diz.d $$0) {
      super($$0);
   }

   @Override
   protected dka b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected cth d() {
      return cmu.ve;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cti $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return g[this.g($$0)];
   }
}
