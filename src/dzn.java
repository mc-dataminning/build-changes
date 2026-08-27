import com.mojang.serialization.Codec;

public abstract class dzn {
   public static final Codec<dzn> c = jy.p.q().dispatch("predicate_type", dzn::a, dzo::codec);

   public abstract boolean a(dgb var1, ate var2);

   protected abstract dzo<?> a();
}
