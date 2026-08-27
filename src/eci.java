import com.mojang.serialization.Codec;

public abstract class eci {
   public static final Codec<eci> c = kb.o.q().dispatch("predicate_type", eci::a, ecj::codec);

   public abstract boolean a(dip var1, auf var2);

   protected abstract ecj<?> a();
}
