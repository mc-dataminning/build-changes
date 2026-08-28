import com.mojang.serialization.MapCodec;

public class dqu extends dke {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final int b = 2;
   public static final dwn c = dwe.aq;
   private static final float g = 3.0F;
   private static final fal[] h = new fal[]{dij.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), dij.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   public dqu(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   public fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dwn b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dfe d() {
      return cwj.vA;
   }

   @Override
   public dvo b(int $$0) {
      return $$0 == 2 ? dil.bS.m() : super.b($$0);
   }

   @Override
   public void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dff $$0) {
      return 1;
   }
}
