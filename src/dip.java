import com.mojang.serialization.MapCodec;

public class dip extends dez {
   public static final MapCodec<dip> d = b(dip::new);

   @Override
   protected MapCodec<? extends dip> a() {
      return d;
   }

   protected dip(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
