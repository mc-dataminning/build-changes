import com.mojang.serialization.MapCodec;

public class dka extends dmo {
   public static final MapCodec<dka> a = b(dka::new);

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   public dka(drz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(li.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
