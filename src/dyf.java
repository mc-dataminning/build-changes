import com.mojang.serialization.Codec;

public abstract class dyf {
   public static final Codec<dyf> c = jb.r.q().dispatch("predicate_type", dyf::a, dyg::codec);

   public abstract boolean a(gu var1, gu var2, gu var3, aru var4);

   protected abstract dyg<?> a();
}
