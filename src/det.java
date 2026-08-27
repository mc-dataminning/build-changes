import com.mojang.serialization.MapCodec;

public class det extends cye {
   public static final MapCodec<det> a = b(det::new);
   public static final int b = 2;
   public static final dka c = djq.aq;
   private static final float g = 3.0F;
   private static final emf[] h = new emf[]{cwj.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cwj.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(diz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dka b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected cth d() {
      return cmu.vb;
   }

   @Override
   public dja b(int $$0) {
      return $$0 == 2 ? cwl.bS.o() : super.b($$0);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cti $$0) {
      return 1;
   }
}
