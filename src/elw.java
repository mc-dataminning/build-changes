import com.mojang.serialization.Codec;

public abstract class elw {
   public static final Codec<elw> c = lp.q.q().dispatch("predicate_type", elw::a, elx::codec);

   public abstract boolean a(iz var1, iz var2, iz var3, azg var4);

   protected abstract elx<?> a();
}
