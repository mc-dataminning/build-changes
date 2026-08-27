import com.mojang.serialization.MapCodec;

public class dhj extends djx {
   public static final MapCodec<dhj> a = b(dhj::new);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dph.d $$0) {
      super($$0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kn.X, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
