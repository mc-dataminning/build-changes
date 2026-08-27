import com.mojang.serialization.Codec;

public abstract class ebb {
   public static final Codec<ebb> c = jy.p.q().dispatch("predicate_type", ebb::a, ebc::codec);

   public abstract boolean a(dhi var1, ats var2);

   protected abstract ebc<?> a();
}
