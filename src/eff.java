import com.mojang.serialization.Codec;

public abstract class eff {
   public static final Codec<eff> c = kf.o.q().dispatch("predicate_type", eff::a, efg::codec);

   public abstract boolean a(dlj var1, awp var2);

   protected abstract efg<?> a();
}
