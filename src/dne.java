import com.mojang.serialization.MapCodec;

public class dne extends djn {
   public static final MapCodec<dne> d = b(dne::new);

   @Override
   protected MapCodec<? extends dne> a() {
      return d;
   }

   protected dne(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwy $$0, dwy $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
