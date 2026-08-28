import com.mojang.serialization.Codec;

public abstract class eor {
   public static final Codec<eor> c = lu.o.q().dispatch("predicate_type", eor::a, eos::codec);

   public abstract boolean a(je var1, je var2, je var3, azl var4);

   protected abstract eos<?> a();
}
