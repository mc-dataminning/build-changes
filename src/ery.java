import com.mojang.serialization.Codec;

public abstract class ery {
   public static final Codec<ery> c = ma.m.q().dispatch("predicate_type", ery::a, erz::codec);

   public abstract boolean a(dxn var1, bam var2);

   protected abstract erz<?> a();
}
