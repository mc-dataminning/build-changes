import com.mojang.serialization.MapCodec;

public class dsy extends dvp {
   public static final MapCodec<dsy> a = b(dsy::new);

   @Override
   public MapCodec<dsy> a() {
      return a;
   }

   public dsy(ebp.d $$0) {
      super($$0);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lz.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
