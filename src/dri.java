import com.mojang.serialization.MapCodec;

public class dri extends dno {
   public static final MapCodec<dri> d = b(dri::new);

   @Override
   protected MapCodec<? extends dri> a() {
      return d;
   }

   protected dri(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
