import com.mojang.serialization.Codec;

public abstract class era {
   public static final Codec<era> c = mb.o.q().dispatch("predicate_type", era::a, erb::codec);

   public abstract boolean a(ji var1, ji var2, ji var3, azh var4);

   protected abstract erb<?> a();
}
