import com.mojang.serialization.MapCodec;

public class dik extends deu {
   public static final MapCodec<dik> d = b(dik::new);

   @Override
   protected MapCodec<? extends dik> a() {
      return d;
   }

   protected dik(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drx $$0, drx $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
