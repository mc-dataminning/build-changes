import com.mojang.serialization.Codec;

public abstract class eml {
   public static final Codec<eml> c = lq.o.r().dispatch("predicate_type", eml::a, emm::codec);

   public abstract boolean a(ja var1, ja var2, ja var3, ayo var4);

   protected abstract emm<?> a();
}
