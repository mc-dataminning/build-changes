import com.mojang.serialization.Codec;

public abstract class eda {
   public static final Codec<eda> c = kd.o.q().dispatch("predicate_type", eda::a, edb::codec);

   public abstract boolean a(djh var1, auv var2);

   protected abstract edb<?> a();
}
