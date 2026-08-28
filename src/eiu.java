import com.mojang.serialization.Codec;

public abstract class eiu {
   public static final Codec<eiu> a = lz.T.q().dispatch(eiu::a, eiv::a);

   public static ejd a(dvo $$0) {
      return new ejd($$0);
   }

   public static ejd a(dij $$0) {
      return new ejd($$0.m());
   }

   protected abstract eiv<?> a();

   public abstract dvo a(azv var1, jh var2);
}
