import com.mojang.serialization.Codec;

public abstract class dzg {
   public static final Codec<dzg> c = jy.r.q().dispatch("predicate_type", dzg::a, dzh::codec);

   public abstract boolean a(ht var1, ht var2, ht var3, ate var4);

   protected abstract dzh<?> a();
}
