import com.mojang.serialization.Codec;

public abstract class eky {
   public static final Codec<eky> c = le.q.q().dispatch("predicate_type", eky::a, ekz::codec);

   public abstract boolean a(io var1, io var2, io var3, aym var4);

   protected abstract ekz<?> a();
}
