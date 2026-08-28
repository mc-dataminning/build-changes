import com.mojang.serialization.Codec;

public abstract class emg {
   public static final Codec<emg> c = lp.o.q().dispatch("predicate_type", emg::a, emh::codec);

   public abstract boolean a(dse var1, azh var2);

   protected abstract emh<?> a();
}
