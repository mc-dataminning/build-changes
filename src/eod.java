import com.mojang.serialization.Codec;

public abstract class eod {
   public static final Codec<eod> a = mg.T.q().dispatch(eod::a, eoe::a);

   public static eom a(eat $$0) {
      return new eom($$0);
   }

   public static eom a(dmr $$0) {
      return new eom($$0.m());
   }

   protected abstract eoe<?> a();

   public abstract eat a(azv var1, iv var2);
}
