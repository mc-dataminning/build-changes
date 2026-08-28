import com.mojang.serialization.Codec;

public abstract class ery {
   public static final Codec<ery> c = mb.o.q().dispatch("predicate_type", ery::a, erz::codec);

   public abstract boolean a(ji var1, ji var2, ji var3, azh var4);

   protected abstract erz<?> a();
}
