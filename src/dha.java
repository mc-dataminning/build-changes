import com.mojang.serialization.MapCodec;

public class dha extends djo {
   public static final MapCodec<dha> a = b(dha::new);

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(doy.d $$0) {
      super($$0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kl.X, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
