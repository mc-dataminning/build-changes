import com.mojang.serialization.Codec;

public abstract class ems {
   public static final Codec<ems> c = lq.m.r().dispatch("predicate_type", ems::a, emt::codec);

   public abstract boolean a(dsl var1, ayo var2);

   protected abstract emt<?> a();
}
