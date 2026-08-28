import com.mojang.serialization.MapCodec;

public class djm extends dfw {
   public static final MapCodec<djm> d = b(djm::new);

   @Override
   protected MapCodec<? extends djm> a() {
      return d;
   }

   protected djm(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dta $$0, dta $$1, ji $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
