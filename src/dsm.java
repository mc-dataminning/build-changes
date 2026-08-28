import com.mojang.serialization.MapCodec;

public class dsm extends dvd {
   public static final MapCodec<dsm> a = b(dsm::new);

   @Override
   public MapCodec<dsm> a() {
      return a;
   }

   public dsm(ebd.d $$0) {
      super($$0);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ly.ac, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
