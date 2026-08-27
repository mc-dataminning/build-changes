import com.mojang.serialization.MapCodec;

public class dfe extends dhs {
   public static final MapCodec<dfe> a = b(dfe::new);

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public dfe(dna.d $$0) {
      super($$0);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kc.X, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
