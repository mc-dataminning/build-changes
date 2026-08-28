import com.mojang.serialization.MapCodec;

public class dkl extends dgv {
   public static final MapCodec<dkl> d = b(dkl::new);

   @Override
   protected MapCodec<? extends dkl> a() {
      return d;
   }

   protected dkl(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dua $$0, dua $$1, jj $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
