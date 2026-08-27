import com.mojang.serialization.Codec;

public abstract class ejk {
   public static final Codec<ejk> c = kt.o.q().dispatch("predicate_type", ejk::a, ejl::codec);

   public abstract boolean a(dpi var1, axt var2);

   protected abstract ejl<?> a();
}
