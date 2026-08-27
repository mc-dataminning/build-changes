import com.mojang.serialization.Codec;

public abstract class dvn {
   public static final Codec<dvn> c = jb.p.q().dispatch("predicate_type", dvn::a, dvo::codec);

   public abstract boolean a(dcb var1, apf var2);

   protected abstract dvo<?> a();
}
