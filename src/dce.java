import com.mojang.serialization.MapCodec;

public class dce extends cyo {
   public static final MapCodec<dce> d = b(dce::new);

   @Override
   protected MapCodec<? extends dce> a() {
      return d;
   }

   protected dce(dle.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlf $$0, dlf $$1, ie $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
