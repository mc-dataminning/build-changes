import com.mojang.serialization.MapCodec;

public class dov extends dje {
   public static final MapCodec<dov> d = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return d;
   }

   public dov(dxt.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dxu $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dxu $$0) {
      return true;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return 3;
   }
}
