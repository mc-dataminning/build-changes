import com.mojang.serialization.Codec;

public abstract class eku {
   public static final Codec<eku> a = ma.T.q().dispatch(eku::a, ekv::a);

   public static eld a(dxo $$0) {
      return new eld($$0);
   }

   public static eld a(dkd $$0) {
      return new eld($$0.m());
   }

   protected abstract ekv<?> a();

   public abstract dxo a(bac var1, jh var2);
}
