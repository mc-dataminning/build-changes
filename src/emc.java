import com.mojang.serialization.Codec;

public abstract class emc {
   public static final Codec<emc> c = lp.o.q().dispatch("predicate_type", emc::a, emd::codec);

   public abstract boolean a(dsa var1, azf var2);

   protected abstract emd<?> a();
}
