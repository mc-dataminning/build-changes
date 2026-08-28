import com.mojang.serialization.Codec;

public abstract class emf {
   public static final Codec<emf> c = lp.o.q().dispatch("predicate_type", emf::a, emg::codec);

   public abstract boolean a(dsd var1, azh var2);

   protected abstract emg<?> a();
}
