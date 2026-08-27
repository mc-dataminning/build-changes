import com.mojang.serialization.Codec;

public abstract class eai {
   public static final Codec<eai> c = jy.r.q().dispatch("predicate_type", eai::a, eaj::codec);

   public abstract boolean a(ht var1, ht var2, ht var3, ato var4);

   protected abstract eaj<?> a();
}
