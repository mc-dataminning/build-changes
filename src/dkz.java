import com.mojang.serialization.MapCodec;

public class dkz extends dno {
   public static final MapCodec<dkz> a = b(dkz::new);

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(dsz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lm.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
