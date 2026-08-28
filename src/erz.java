import com.mojang.serialization.Codec;

public abstract class erz {
   public static final Codec<erz> c = ma.m.q().dispatch("predicate_type", erz::a, esa::codec);

   public abstract boolean a(dxo var1, bac var2);

   protected abstract esa<?> a();
}
