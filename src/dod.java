import com.mojang.serialization.MapCodec;

public class dod extends dkm {
   public static final MapCodec<dod> d = b(dod::new);

   @Override
   protected MapCodec<? extends dod> a() {
      return d;
   }

   protected dod(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxv $$0, dxv $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
