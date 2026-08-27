import com.mojang.serialization.MapCodec;

public class daf extends cwp {
   public static final MapCodec<daf> d = b(daf::new);

   @Override
   protected MapCodec<? extends daf> a() {
      return d;
   }

   protected daf(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djg $$0, djg $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
