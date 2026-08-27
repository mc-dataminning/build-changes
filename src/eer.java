import com.mojang.serialization.Codec;

public abstract class eer {
   public static final Codec<eer> c = kf.q.q().dispatch("predicate_type", eer::a, ees::codec);

   public abstract boolean a(hz var1, hz var2, hz var3, awo var4);

   protected abstract ees<?> a();
}
