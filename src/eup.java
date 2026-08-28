import com.mojang.serialization.Codec;

public abstract class eup {
   public static final Codec<eup> c = mf.m.q().dispatch("predicate_type", eup::a, euq::codec);

   public abstract boolean a(dzz var1, azv var2);

   protected abstract euq<?> a();
}
