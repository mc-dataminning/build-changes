import com.mojang.serialization.Codec;

public abstract class dyq {
   public static final Codec<dyq> c = jd.r.q().dispatch("predicate_type", dyq::a, dyr::codec);

   public abstract boolean a(gw var1, gw var2, gw var3, ase var4);

   protected abstract dyr<?> a();
}
