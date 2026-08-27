import com.mojang.serialization.Codec;

public abstract class dzx {
   public static final Codec<dzx> a = ki.V.q().dispatch(dzx::a, dzy::a);

   public static eag a(dnb $$0) {
      return new eag($$0);
   }

   public static eag a(dac $$0) {
      return new eag($$0.o());
   }

   protected abstract dzy<?> a();

   public abstract dnb a(axd var1, ib var2);
}
