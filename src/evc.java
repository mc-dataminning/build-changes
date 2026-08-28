import com.mojang.serialization.Codec;

public abstract class evc {
   public static final Codec<evc> c = mg.o.q().dispatch("predicate_type", evc::a, evd::codec);

   public abstract boolean a(iv var1, iv var2, iv var3, azv var4);

   protected abstract evd<?> a();
}
