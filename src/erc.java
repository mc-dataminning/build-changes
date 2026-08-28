import com.mojang.serialization.Codec;

public abstract class erc {
   public static final Codec<erc> c = mb.o.q().dispatch("predicate_type", erc::a, erd::codec);

   public abstract boolean a(ji var1, ji var2, ji var3, azh var4);

   protected abstract erd<?> a();
}
