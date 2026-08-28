import com.mojang.serialization.Codec;

public abstract class eoy {
   public static final Codec<eoy> c = lu.m.q().dispatch("predicate_type", eoy::a, eoz::codec);

   public abstract boolean a(duo var1, azl var2);

   protected abstract eoz<?> a();
}
