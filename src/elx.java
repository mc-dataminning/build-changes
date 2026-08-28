import com.mojang.serialization.Codec;

public abstract class elx {
   public static final Codec<elx> c = lp.q.q().dispatch("predicate_type", elx::a, ely::codec);

   public abstract boolean a(iz var1, iz var2, iz var3, azh var4);

   protected abstract ely<?> a();
}
