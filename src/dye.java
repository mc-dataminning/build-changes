import com.mojang.serialization.Codec;

public abstract class dye {
   public static final Codec<dye> c = jb.r.q().dispatch("predicate_type", dye::a, dyf::codec);

   public abstract boolean a(gu var1, gu var2, gu var3, aru var4);

   protected abstract dyf<?> a();
}
