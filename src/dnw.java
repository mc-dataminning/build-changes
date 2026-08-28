import com.mojang.serialization.MapCodec;

public class dnw extends dke {
   public static final MapCodec<dnw> d = b(dnw::new);

   @Override
   protected MapCodec<? extends dnw> a() {
      return d;
   }

   protected dnw(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxq $$0, dxq $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
