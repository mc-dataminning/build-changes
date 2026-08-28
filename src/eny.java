import com.mojang.serialization.Codec;

public abstract class eny {
   public static final Codec<eny> a = mg.T.q().dispatch(eny::a, enz::a);

   public static eoh a(eao $$0) {
      return new eoh($$0);
   }

   public static eoh a(dmm $$0) {
      return new eoh($$0.m());
   }

   protected abstract enz<?> a();

   public abstract eao a(azv var1, iv var2);
}
