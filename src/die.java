import com.mojang.serialization.MapCodec;

public class die extends dke {
   public static final MapCodec<die> a = b(die::new);
   public static final int b = 3;
   public static final dwn c = dwe.as;
   private static final fal[] g = new fal[]{
      dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected dwn b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dfe d() {
      return cwj.vD;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dff $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return g[this.h($$0)];
   }
}
