import com.mojang.serialization.MapCodec;

public class dlb extends dnq {
   public static final MapCodec<dlb> a = b(dlb::new);

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lm.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
