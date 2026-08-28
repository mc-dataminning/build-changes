import com.mojang.serialization.Codec;

public abstract class emd {
   public static final Codec<emd> c = lq.o.r().dispatch("predicate_type", emd::a, eme::codec);

   public abstract boolean a(ja var1, ja var2, ja var3, aym var4);

   protected abstract eme<?> a();
}
