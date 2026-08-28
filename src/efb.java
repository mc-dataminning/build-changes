import com.mojang.serialization.Codec;

public abstract class efb {
   public static final Codec<efb> a = lp.V.q().dispatch(efb::a, efc::a);

   public static efk a(dsa $$0) {
      return new efk($$0);
   }

   public static efk a(dex $$0) {
      return new efk($$0.o());
   }

   protected abstract efc<?> a();

   public abstract dsa a(azf var1, iz var2);
}
