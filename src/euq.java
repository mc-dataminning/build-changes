import com.mojang.serialization.Codec;

public abstract class euq {
   public static final Codec<euq> c = mf.o.q().dispatch("predicate_type", euq::a, eur::codec);

   public abstract boolean a(iu var1, iu var2, iu var3, azv var4);

   protected abstract eur<?> a();
}
