import com.mojang.serialization.Codec;

public abstract class err {
   public static final Codec<err> c = ma.o.q().dispatch("predicate_type", err::a, ers::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, bam var4);

   protected abstract ers<?> a();
}
