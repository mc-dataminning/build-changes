import com.mojang.serialization.Codec;

public abstract class eey {
   public static final Codec<eey> a = lp.V.q().dispatch(eey::a, eez::a);

   public static efh a(drx $$0) {
      return new efh($$0);
   }

   public static efh a(deu $$0) {
      return new efh($$0.n());
   }

   protected abstract eez<?> a();

   public abstract drx a(azc var1, iz var2);
}
