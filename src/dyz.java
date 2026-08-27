import com.mojang.serialization.Codec;

public abstract class dyz {
   public static final Codec<dyz> a = kh.V.q().dispatch(dyz::a, dza::a);

   public static dzi a(dme $$0) {
      return new dzi($$0);
   }

   public static dzi a(czf $$0) {
      return new dzi($$0.o());
   }

   protected abstract dza<?> a();

   public abstract dme a(awt var1, ib var2);
}
