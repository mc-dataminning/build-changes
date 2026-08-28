import com.mojang.serialization.Codec;

public abstract class eoq {
   public static final Codec<eoq> a = mg.T.q().dispatch(eoq::a, eor::a);

   public static eoz a(ebe $$0) {
      return new eoz($$0);
   }

   public static eoz a(dnc $$0) {
      return new eoz($$0.m());
   }

   protected abstract eor<?> a();

   public abstract ebe a(azx var1, iv var2);
}
