import com.mojang.serialization.MapCodec;

public class czh extends ctt {
   public static final MapCodec<czh> d = b(czh::new);

   @Override
   public MapCodec<czh> a() {
      return d;
   }

   public czh(dhh.d $$0) {
      super($$0, iy.e);
   }

   @Override
   protected double b(dhi $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dhi $$0) {
      return true;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return 3;
   }
}
