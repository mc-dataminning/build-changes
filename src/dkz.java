import com.mojang.serialization.MapCodec;

public class dkz extends dhj {
   public static final MapCodec<dkz> d = b(dkz::new);

   @Override
   protected MapCodec<? extends dkz> a() {
      return d;
   }

   protected dkz(dun.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(duo $$0, duo $$1, jj $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
