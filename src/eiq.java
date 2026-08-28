import com.mojang.serialization.Codec;

public abstract class eiq {
   public static final Codec<eiq> a = ly.T.q().dispatch(eiq::a, eir::a);

   public static eiz a(dvj $$0) {
      return new eiz($$0);
   }

   public static eiz a(die $$0) {
      return new eiz($$0.m());
   }

   protected abstract eir<?> a();

   public abstract dvj a(azs var1, jh var2);
}
