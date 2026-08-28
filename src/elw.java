import com.mojang.serialization.Codec;

public abstract class elw {
   public static final Codec<elw> a = md.T.q().dispatch(elw::a, elx::a);

   public static emf a(dym $$0) {
      return new emf($$0);
   }

   public static emf a(dku $$0) {
      return new emf($$0.m());
   }

   protected abstract elx<?> a();

   public abstract dym a(azs var1, jj var2);
}
