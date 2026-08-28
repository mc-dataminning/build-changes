import com.mojang.serialization.Codec;

public abstract class erz {
   public static final Codec<erz> c = ma.o.q().dispatch("predicate_type", erz::a, esa::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, bam var4);

   protected abstract esa<?> a();
}
