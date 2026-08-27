import com.mojang.serialization.Codec;

public abstract class eaz {
   public static final Codec<eaz> c = kc.r.q().dispatch("predicate_type", eaz::a, eba::codec);

   public abstract boolean a(hx var1, hx var2, hx var3, atw var4);

   protected abstract eba<?> a();
}
