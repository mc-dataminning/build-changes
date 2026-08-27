import com.mojang.serialization.Codec;

public abstract class eft {
   public static final Codec<eft> c = kh.q.q().dispatch("predicate_type", eft::a, efu::codec);

   public abstract boolean a(ib var1, ib var2, ib var3, awt var4);

   protected abstract efu<?> a();
}
