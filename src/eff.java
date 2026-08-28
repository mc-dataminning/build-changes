import com.mojang.serialization.Codec;

public abstract class eff {
   public static final Codec<eff> a = lp.V.q().dispatch(eff::a, efg::a);

   public static efo a(dse $$0) {
      return new efo($$0);
   }

   public static efo a(dfb $$0) {
      return new efo($$0.o());
   }

   protected abstract efg<?> a();

   public abstract dse a(azh var1, iz var2);
}
