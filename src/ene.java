import com.mojang.serialization.Codec;

public abstract class ene {
   public static final Codec<ene> c = lt.o.r().dispatch("predicate_type", ene::a, enf::codec);

   public abstract boolean a(jd var1, jd var2, jd var3, ayw var4);

   protected abstract enf<?> a();
}
