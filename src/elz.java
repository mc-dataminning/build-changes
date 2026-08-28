import com.mojang.serialization.Codec;

public abstract class elz {
   public static final Codec<elz> c = lp.o.q().dispatch("predicate_type", elz::a, ema::codec);

   public abstract boolean a(drx var1, azc var2);

   protected abstract ema<?> a();
}
