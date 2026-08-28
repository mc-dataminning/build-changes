import com.mojang.serialization.MapCodec;

public class din extends dex {
   public static final MapCodec<din> d = b(din::new);

   @Override
   protected MapCodec<? extends din> a() {
      return d;
   }

   protected din(drz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsa $$0, dsa $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
