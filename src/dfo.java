import com.mojang.serialization.MapCodec;

public class dfo extends dby {
   public static final MapCodec<dfo> d = b(dfo::new);

   @Override
   protected MapCodec<? extends dfo> a() {
      return d;
   }

   protected dfo(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(doz $$0, doz $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
