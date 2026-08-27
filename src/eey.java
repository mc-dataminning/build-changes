import com.mojang.serialization.Codec;

public abstract class eey {
   public static final Codec<eey> c = kf.q.q().dispatch("predicate_type", eey::a, eez::codec);

   public abstract boolean a(hz var1, hz var2, hz var3, awp var4);

   protected abstract eez<?> a();
}
