import com.mojang.serialization.MapCodec;

public class dnv extends dke {
   public static final MapCodec<dnv> d = b(dnv::new);

   @Override
   protected MapCodec<? extends dnv> a() {
      return d;
   }

   protected dnv(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxn $$0, dxn $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
