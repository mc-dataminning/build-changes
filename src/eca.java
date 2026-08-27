import com.mojang.serialization.Codec;

public abstract class eca {
   public static final Codec<eca> a = kr.V.q().dispatch(eca::a, ecb::a);

   public static ecj a(doz $$0) {
      return new ecj($$0);
   }

   public static ecj a(dby $$0) {
      return new ecj($$0.n());
   }

   protected abstract ecb<?> a();

   public abstract doz a(axr var1, ib var2);
}
