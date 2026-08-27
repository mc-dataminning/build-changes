import com.mojang.serialization.Codec;

public abstract class ejt {
   public static final Codec<ejt> c = lc.q.q().dispatch("predicate_type", ejt::a, eju::codec);

   public abstract boolean a(im var1, im var2, im var3, ayd var4);

   protected abstract eju<?> a();
}
