import com.mojang.serialization.Codec;

public abstract class ery {
   public static final Codec<ery> c = ma.o.q().dispatch("predicate_type", ery::a, erz::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, bam var4);

   protected abstract erz<?> a();
}
