import com.mojang.serialization.MapCodec;

public class dbb extends ddp {
   public static final MapCodec<dbb> a = b(dbb::new);

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public dbb(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jv.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
