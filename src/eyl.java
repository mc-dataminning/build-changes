import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.util.Map;
import javax.annotation.Nullable;

public class eyl implements eyj {
   private final Int2ObjectMap<eyi.a> b;

   public eyl(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eyi.a)() -> $$1));
   }

   @Nullable
   @Override
   public eyi a(int $$0) {
      return (eyi)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fko {
      public static final MapCodec<eyl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axm.z, Codec.FLOAT).fieldOf("advances").forGetter(eyl.a::c)).apply($$0, eyl.a::new)
      );

      @Override
      public fkp a() {
         return fkp.c;
      }

      @Override
      public Either<fko.b, fko.c> b() {
         fko.b $$0 = $$0x -> new eyl(this.c);
         return Either.left($$0);
      }
   }
}
