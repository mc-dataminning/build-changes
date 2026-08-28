import com.mojang.serialization.MapCodec;

public class dso extends dvf {
   public static final MapCodec<dso> a = b(dso::new);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(ebf.d $$0) {
      super($$0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lz.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
