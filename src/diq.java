import com.mojang.serialization.MapCodec;

public class diq extends dfa {
   public static final MapCodec<diq> d = b(diq::new);

   @Override
   protected MapCodec<? extends diq> a() {
      return d;
   }

   protected diq(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsd $$0, dsd $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
