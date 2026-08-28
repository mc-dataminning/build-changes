import com.mojang.serialization.MapCodec;

public class doo extends dix {
   public static final MapCodec<doo> d = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return d;
   }

   public doo(dxm.d $$0) {
      super($$0, kn.e);
   }

   @Override
   protected double b(dxn $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dxn $$0) {
      return true;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return 3;
   }
}
