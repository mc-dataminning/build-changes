import com.mojang.serialization.MapCodec;

public class czz extends cwj {
   public static final MapCodec<czz> d = b(czz::new);

   @Override
   protected MapCodec<? extends czz> a() {
      return d;
   }

   protected czz(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dja $$0, dja $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
