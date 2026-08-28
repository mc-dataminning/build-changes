import com.mojang.serialization.Codec;

public abstract class eod {
   public static final Codec<eod> c = lu.o.q().dispatch("predicate_type", eod::a, eoe::codec);

   public abstract boolean a(je var1, je var2, je var3, azk var4);

   protected abstract eoe<?> a();
}
