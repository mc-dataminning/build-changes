import com.mojang.serialization.Codec;

public abstract class dyp {
   public static final Codec<dyp> c = jb.p.q().dispatch("predicate_type", dyp::a, dyq::codec);

   public abstract boolean a(dfd var1, ash var2);

   protected abstract dyq<?> a();
}
