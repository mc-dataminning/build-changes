import com.mojang.serialization.Codec;

public abstract class eri {
   public static final Codec<eri> c = mb.m.q().dispatch("predicate_type", eri::a, erj::codec);

   public abstract boolean a(dwx var1, azh var2);

   protected abstract erj<?> a();
}
