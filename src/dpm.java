import com.mojang.serialization.MapCodec;

public class dpm extends dlu {
   public static final MapCodec<dpm> d = b(dpm::new);

   @Override
   protected MapCodec<? extends dpm> a() {
      return d;
   }

   protected dpm(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dzo $$0, dzo $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
