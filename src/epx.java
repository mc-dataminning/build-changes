import com.mojang.serialization.Codec;

public abstract class epx {
   public static final Codec<epx> c = lz.o.q().dispatch("predicate_type", epx::a, epy::codec);

   public abstract boolean a(jh var1, jh var2, jh var3, azu var4);

   protected abstract epy<?> a();
}
