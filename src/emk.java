import com.mojang.serialization.Codec;

public abstract class emk {
   public static final Codec<emk> c = lq.m.r().dispatch("predicate_type", emk::a, eml::codec);

   public abstract boolean a(dsh var1, aym var2);

   protected abstract eml<?> a();
}
