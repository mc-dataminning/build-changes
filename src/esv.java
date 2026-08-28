import com.mojang.serialization.Codec;

public abstract class esv {
   public static final Codec<esv> c = md.o.q().dispatch("predicate_type", esv::a, esw::codec);

   public abstract boolean a(jj var1, jj var2, jj var3, azs var4);

   protected abstract esw<?> a();
}
