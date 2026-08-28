import com.mojang.serialization.Codec;

public abstract class enn {
   public static final Codec<enn> c = lt.m.r().dispatch("predicate_type", enn::a, eno::codec);

   public abstract boolean a(dtc var1, ayw var2);

   protected abstract eno<?> a();
}
