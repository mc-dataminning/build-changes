import com.mojang.serialization.MapCodec;

public class dna extends dpp {
   public static final MapCodec<dna> a = b(dna::new);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(dvc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lq.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
