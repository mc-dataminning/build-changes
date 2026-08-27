import com.mojang.serialization.Codec;

public abstract class edb {
   public static final Codec<edb> c = kd.q.q().dispatch("predicate_type", edb::a, edc::codec);

   public abstract boolean a(hx var1, hx var2, hx var3, auw var4);

   protected abstract edc<?> a();
}
