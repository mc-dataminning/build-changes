import com.mojang.serialization.Codec;

public abstract class ebg {
   public static final Codec<ebg> c = kc.p.q().dispatch("predicate_type", ebg::a, ebh::codec);

   public abstract boolean a(dhn var1, atw var2);

   protected abstract ebh<?> a();
}
