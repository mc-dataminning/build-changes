import com.mojang.serialization.Codec;

public abstract class eov {
   public static final Codec<eov> c = lv.o.q().dispatch("predicate_type", eov::a, eow::codec);

   public abstract boolean a(jf var1, jf var2, jf var3, azn var4);

   protected abstract eow<?> a();
}
