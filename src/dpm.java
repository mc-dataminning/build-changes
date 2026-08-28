import com.mojang.serialization.MapCodec;

public class dpm extends dsb {
   public static final MapCodec<dpm> a = b(dpm::new);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dxp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lt.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
