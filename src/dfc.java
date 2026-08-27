import com.mojang.serialization.MapCodec;

public class dfc extends dhq {
   public static final MapCodec<dfc> a = b(dfc::new);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dmy.d $$0) {
      super($$0);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(kc.X, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
