import com.mojang.serialization.Codec;

public abstract class epx {
   public static final Codec<epx> c = lz.m.q().dispatch("predicate_type", epx::a, epy::codec);

   public abstract boolean a(dvo var1, azv var2);

   protected abstract epy<?> a();
}
