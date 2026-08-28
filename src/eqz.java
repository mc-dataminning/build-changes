import com.mojang.serialization.Codec;

public abstract class eqz {
   public static final Codec<eqz> c = mb.o.q().dispatch("predicate_type", eqz::a, era::codec);

   public abstract boolean a(ji var1, ji var2, ji var3, azg var4);

   protected abstract era<?> a();
}
