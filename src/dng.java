import com.mojang.serialization.MapCodec;

public class dng extends dpv {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dvi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lr.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
