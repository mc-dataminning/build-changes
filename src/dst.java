import com.mojang.serialization.Codec;

public abstract class dst {
   public static final Codec<dst> a = jy.W.q().dispatch(dst::a, dsu::a);

   public static dtc a(dgb $$0) {
      return new dtc($$0);
   }

   public static dtc a(cua $$0) {
      return new dtc($$0.o());
   }

   protected abstract dsu<?> a();

   public abstract dgb a(ate var1, ht var2);
}
