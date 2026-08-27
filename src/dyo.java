import com.mojang.serialization.Codec;

public abstract class dyo {
   public static final Codec<dyo> c = jd.r.q().dispatch("predicate_type", dyo::a, dyp::codec);

   public abstract boolean a(gw var1, gw var2, gw var3, asc var4);

   protected abstract dyp<?> a();
}
