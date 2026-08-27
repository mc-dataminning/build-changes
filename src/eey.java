import com.mojang.serialization.Codec;

public abstract class eey {
   public static final Codec<eey> c = kf.o.q().dispatch("predicate_type", eey::a, eez::codec);

   public abstract boolean a(dlf var1, awo var2);

   protected abstract eez<?> a();
}
