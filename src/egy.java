import com.mojang.serialization.Codec;

public abstract class egy {
   public static final Codec<egy> c = ki.o.q().dispatch("predicate_type", egy::a, egz::codec);

   public abstract boolean a(dnb var1, axd var2);

   protected abstract egz<?> a();
}
