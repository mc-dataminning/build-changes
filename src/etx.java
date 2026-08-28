import com.mojang.serialization.Codec;

public abstract class etx {
   public static final Codec<etx> c = mf.o.q().dispatch("predicate_type", etx::a, ety::codec);

   public abstract boolean a(iu var1, iu var2, iu var3, azt var4);

   protected abstract ety<?> a();
}
