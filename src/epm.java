import com.mojang.serialization.Codec;

public abstract class epm {
   public static final Codec<epm> c = ly.o.q().dispatch("predicate_type", epm::a, epn::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, azs var4);

   protected abstract epn<?> a();
}
