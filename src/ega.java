import com.mojang.serialization.Codec;

public abstract class ega {
   public static final Codec<ega> c = kh.o.q().dispatch("predicate_type", ega::a, egb::codec);

   public abstract boolean a(dme var1, awt var2);

   protected abstract egb<?> a();
}
