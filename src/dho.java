import com.mojang.serialization.MapCodec;

public class dho extends ddy {
   public static final MapCodec<dho> d = b(dho::new);

   @Override
   protected MapCodec<? extends dho> a() {
      return d;
   }

   protected dho(dra.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drb $$0, drb $$1, it $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
