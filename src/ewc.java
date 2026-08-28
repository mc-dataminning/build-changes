import com.mojang.serialization.Codec;

public abstract class ewc {
   public static final Codec<ewc> c = mh.o.q().dispatch("predicate_type", ewc::a, ewd::codec);

   public abstract boolean a(iw var1, iw var2, iw var3, bai var4);

   protected abstract ewd<?> a();
}
