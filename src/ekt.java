import com.mojang.serialization.Codec;

public abstract class ekt {
   public static final Codec<ekt> a = ma.T.q().dispatch(ekt::a, eku::a);

   public static elc a(dxn $$0) {
      return new elc($$0);
   }

   public static elc a(dke $$0) {
      return new elc($$0.m());
   }

   protected abstract eku<?> a();

   public abstract dxn a(bam var1, jh var2);
}
