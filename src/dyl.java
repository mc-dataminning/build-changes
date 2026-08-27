import com.mojang.serialization.Codec;

public abstract class dyl {
   public static final Codec<dyl> c = jb.p.q().dispatch("predicate_type", dyl::a, dym::codec);

   public abstract boolean a(dez var1, aru var2);

   protected abstract dym<?> a();
}
