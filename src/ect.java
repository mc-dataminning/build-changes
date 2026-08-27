import com.mojang.serialization.Codec;

public abstract class ect {
   public static final Codec<ect> c = kd.o.q().dispatch("predicate_type", ect::a, ecu::codec);

   public abstract boolean a(dja var1, aup var2);

   protected abstract ecu<?> a();
}
