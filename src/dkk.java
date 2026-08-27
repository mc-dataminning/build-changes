import com.mojang.serialization.MapCodec;

public class dkk extends dnh {
   public static final MapCodec<dkk> a = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lb.X, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
