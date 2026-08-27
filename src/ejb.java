import com.mojang.serialization.Codec;

public abstract class ejb {
   public static final Codec<ejb> c = kr.o.q().dispatch("predicate_type", ejb::a, ejc::codec);

   public abstract boolean a(doz var1, axr var2);

   protected abstract ejc<?> a();
}
