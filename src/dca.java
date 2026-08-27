import com.mojang.serialization.MapCodec;

public class dca extends deo {
   public static final MapCodec<dca> a = b(dca::new);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jx.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
