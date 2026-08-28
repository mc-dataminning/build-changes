import com.mojang.serialization.Codec;

public abstract class erg {
   public static final Codec<erg> c = mb.m.q().dispatch("predicate_type", erg::a, erh::codec);

   public abstract boolean a(dwv var1, azg var2);

   protected abstract erh<?> a();
}
