import com.mojang.serialization.Codec;

public abstract class eik {
   public static final Codec<eik> a = lx.T.q().dispatch(eik::a, eil::a);

   public static eit a(dvd $$0) {
      return new eit($$0);
   }

   public static eit a(dhy $$0) {
      return new eit($$0.m());
   }

   protected abstract eil<?> a();

   public abstract dvd a(azr var1, jg var2);
}
