import com.mojang.serialization.Codec;

public abstract class efd {
   public static final Codec<efd> a = lp.V.q().dispatch(efd::a, efe::a);

   public static efm a(dsc $$0) {
      return new efm($$0);
   }

   public static efm a(dez $$0) {
      return new efm($$0.o());
   }

   protected abstract efe<?> a();

   public abstract dsc a(azh var1, iz var2);
}
