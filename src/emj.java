import com.mojang.serialization.Codec;

public abstract class emj {
   public static final Codec<emj> c = lq.o.r().dispatch("predicate_type", emj::a, emk::codec);

   public abstract boolean a(ja var1, ja var2, ja var3, ayo var4);

   protected abstract emk<?> a();
}
