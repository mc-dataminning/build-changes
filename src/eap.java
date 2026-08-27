import com.mojang.serialization.Codec;

public abstract class eap {
   public static final Codec<eap> c = jy.p.q().dispatch("predicate_type", eap::a, eaq::codec);

   public abstract boolean a(dgw var1, ato var2);

   protected abstract eaq<?> a();
}
