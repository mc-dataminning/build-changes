import com.mojang.serialization.MapCodec;

public class dhq extends dea {
   public static final MapCodec<dhq> d = b(dhq::new);

   @Override
   protected MapCodec<? extends dhq> a() {
      return d;
   }

   protected dhq(drc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drd $$0, drd $$1, it $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
