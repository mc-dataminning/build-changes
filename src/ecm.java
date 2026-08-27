import com.mojang.serialization.Codec;

public abstract class ecm {
   public static final Codec<ecm> c = kd.q.q().dispatch("predicate_type", ecm::a, ecn::codec);

   public abstract boolean a(hx var1, hx var2, hx var3, aup var4);

   protected abstract ecn<?> a();
}
