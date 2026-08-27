import com.mojang.serialization.Codec;

public abstract class edi {
   public static final Codec<edi> c = kd.o.q().dispatch("predicate_type", edi::a, edj::codec);

   public abstract boolean a(djp var1, auw var2);

   protected abstract edj<?> a();
}
