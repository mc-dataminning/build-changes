import com.mojang.serialization.Codec;

public abstract class eue {
   public static final Codec<eue> c = mf.m.q().dispatch("predicate_type", eue::a, euf::codec);

   public abstract boolean a(dzo var1, azt var2);

   protected abstract euf<?> a();
}
