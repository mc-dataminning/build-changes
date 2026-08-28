import com.mojang.serialization.Codec;

public abstract class enh {
   public static final Codec<enh> c = lt.m.r().dispatch("predicate_type", enh::a, eni::codec);

   public abstract boolean a(dta var1, ayv var2);

   protected abstract eni<?> a();
}
