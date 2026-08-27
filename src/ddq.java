import com.mojang.serialization.MapCodec;

public class ddq extends dge {
   public static final MapCodec<ddq> a = b(ddq::new);

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(dle.d $$0) {
      super($$0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jz.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
