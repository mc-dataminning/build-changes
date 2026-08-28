import com.mojang.serialization.Codec;

public abstract class emd {
   public static final Codec<emd> c = lp.o.q().dispatch("predicate_type", emd::a, eme::codec);

   public abstract boolean a(dsb var1, azg var2);

   protected abstract eme<?> a();
}
