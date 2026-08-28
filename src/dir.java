import com.mojang.serialization.MapCodec;

public class dir extends dfb {
   public static final MapCodec<dir> d = b(dir::new);

   @Override
   protected MapCodec<? extends dir> a() {
      return d;
   }

   protected dir(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dse $$0, dse $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
