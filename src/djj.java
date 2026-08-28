import com.mojang.serialization.MapCodec;

public class djj extends ddu {
   public static final MapCodec<djj> d = b(djj::new);

   @Override
   public MapCodec<djj> a() {
      return d;
   }

   public djj(dsd.d $$0) {
      super($$0, kf.e);
   }

   @Override
   protected double b(dse $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dse $$0) {
      return true;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.aA();
      }
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return 3;
   }
}
