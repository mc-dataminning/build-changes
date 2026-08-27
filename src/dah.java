import com.mojang.serialization.MapCodec;

public class dah extends dcv {
   public static final MapCodec<dah> a = b(dah::new);

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public dah(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(jw.U, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
