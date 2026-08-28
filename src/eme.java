import com.mojang.serialization.Codec;

public abstract class eme {
   public static final Codec<eme> c = lp.o.q().dispatch("predicate_type", eme::a, emf::codec);

   public abstract boolean a(dsc var1, azh var2);

   protected abstract emf<?> a();
}
