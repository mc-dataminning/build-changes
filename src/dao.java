import com.mojang.serialization.MapCodec;

public class dao extends cwy {
   public static final MapCodec<dao> d = b(dao::new);

   @Override
   protected MapCodec<? extends dao> a() {
      return d;
   }

   protected dao(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, djp $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
