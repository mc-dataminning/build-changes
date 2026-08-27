import com.mojang.serialization.MapCodec;

public class dac extends dcq {
   public static final MapCodec<dac> a = b(dac::new);

   @Override
   public MapCodec<dac> a() {
      return a;
   }

   public dac(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(js.U, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
