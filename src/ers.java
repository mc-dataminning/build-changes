import com.mojang.serialization.Codec;

public abstract class ers {
   public static final Codec<ers> c = ma.o.q().dispatch("predicate_type", ers::a, ert::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, bac var4);

   protected abstract ert<?> a();
}
