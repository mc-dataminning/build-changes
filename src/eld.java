import com.mojang.serialization.Codec;

public abstract class eld {
   public static final Codec<eld> c = le.o.q().dispatch("predicate_type", eld::a, ele::codec);

   public abstract boolean a(drb var1, ayk var2);

   protected abstract ele<?> a();
}
