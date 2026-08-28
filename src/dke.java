import com.mojang.serialization.MapCodec;

public class dke extends dms {
   public static final MapCodec<dke> a = b(dke::new);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dsd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(li.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
