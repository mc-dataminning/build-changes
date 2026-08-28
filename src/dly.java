import com.mojang.serialization.MapCodec;

public class dly extends don {
   public static final MapCodec<dly> a = b(dly::new);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dtz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ln.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
