import com.mojang.serialization.MapCodec;

public class ddk extends cwv {
   public static final MapCodec<ddk> a = b(ddk::new);
   public static final int b = 2;
   public static final dii c = dhy.aq;
   private static final float g = 3.0F;
   private static final ekn[] h = new ekn[]{cva.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), cva.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return h[this.g($$0)];
   }

   @Override
   protected dii b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected crz d() {
      return clm.va;
   }

   @Override
   public dhi b(int $$0) {
      return $$0 == 2 ? cvc.bS.o() : super.b($$0);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(csa $$0) {
      return 1;
   }
}
