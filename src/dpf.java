import com.mojang.serialization.MapCodec;

public class dpf extends djn {
   public static final MapCodec<dpf> c = b(dpf::new);

   @Override
   public MapCodec<dpf> a() {
      return c;
   }

   public dpf(dyl.d $$0) {
      super($$0, kp.e);
   }

   @Override
   protected double b(dym $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dym $$0) {
      return true;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aE();
      }
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return 3;
   }
}
