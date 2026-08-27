import com.mojang.serialization.MapCodec;

public class dbl extends ddz {
   public static final MapCodec<dbl> a = b(dbl::new);

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbl(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jx.W, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
