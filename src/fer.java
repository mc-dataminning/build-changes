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

public class fer implements fep {
   private final Int2ObjectMap<feo.a> b;

   public fer(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (feo.a)() -> $$1));
   }

   @Nullable
   @Override
   public feo a(int $$0) {
      return (feo)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frh {
      public static final MapCodec<fer.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(azn.B, Codec.FLOAT).fieldOf("advances").forGetter(fer.a::c)).apply($$0, fer.a::new)
      );

      @Override
      public fri a() {
         return fri.c;
      }

      @Override
      public Either<frh.b, frh.c> b() {
         frh.b $$0 = $$0x -> new fer(this.c);
         return Either.left($$0);
      }
   }
}
