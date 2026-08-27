import com.mojang.serialization.Codec;

public abstract class dyv {
   public static final Codec<dyv> c = jd.p.q().dispatch("predicate_type", dyv::a, dyw::codec);

   public abstract boolean a(dfj var1, asc var2);

   protected abstract dyw<?> a();
}
