import com.mojang.serialization.Codec;

public abstract class evs {
   public static final Codec<evs> c = mh.o.q().dispatch("predicate_type", evs::a, evt::codec);

   public abstract boolean a(iw var1, iw var2, iw var3, azz var4);

   protected abstract evt<?> a();
}
