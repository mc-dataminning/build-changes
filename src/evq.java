import com.mojang.serialization.Codec;

public abstract class evq {
   public static final Codec<evq> c = mg.o.q().dispatch("predicate_type", evq::a, evr::codec);

   public abstract boolean a(iv var1, iv var2, iv var3, azx var4);

   protected abstract evr<?> a();
}
