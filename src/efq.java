import com.mojang.serialization.Codec;

public abstract class efq {
   public static final Codec<efq> a = lq.T.r().dispatch(efq::a, efr::a);

   public static efz a(dsl $$0) {
      return new efz($$0);
   }

   public static efz a(dfi $$0) {
      return new efz($$0.o());
   }

   protected abstract efr<?> a();

   public abstract dsl a(ayo var1, ja var2);
}
