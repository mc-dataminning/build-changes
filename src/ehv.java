import com.mojang.serialization.Codec;

public abstract class ehv {
   public static final Codec<ehv> a = lu.T.q().dispatch(ehv::a, ehw::a);

   public static eie a(duo $$0) {
      return new eie($$0);
   }

   public static eie a(dhj $$0) {
      return new eie($$0.o());
   }

   protected abstract ehw<?> a();

   public abstract duo a(azl var1, je var2);
}
