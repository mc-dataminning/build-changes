import com.mojang.serialization.Codec;

public abstract class eok {
   public static final Codec<eok> c = lu.m.q().dispatch("predicate_type", eok::a, eol::codec);

   public abstract boolean a(dua var1, azk var2);

   protected abstract eol<?> a();
}
