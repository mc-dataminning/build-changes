import com.mojang.serialization.MapCodec;

public class did extends dhm {
   public static final MapCodec<did> a = b(did::new);
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends did> a() {
      return a;
   }

   public did(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return !$$1.u($$2.e());
   }
}
