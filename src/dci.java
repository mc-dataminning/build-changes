import com.mojang.serialization.MapCodec;

public class dci extends cys {
   public static final MapCodec<dci> d = b(dci::new);

   @Override
   protected MapCodec<? extends dci> a() {
      return d;
   }

   protected dci(dli.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlj $$0, dlj $$1, ie $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
