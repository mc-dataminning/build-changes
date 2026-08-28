import com.mojang.serialization.Codec;

public abstract class eng {
   public static final Codec<eng> c = lt.o.r().dispatch("predicate_type", eng::a, enh::codec);

   public abstract boolean a(jd var1, jd var2, jd var3, ayw var4);

   protected abstract enh<?> a();
}
