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

public class fet implements fer {
   private final Int2ObjectMap<feq.a> b;

   public fet(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (feq.a)() -> $$1));
   }

   @Nullable
   @Override
   public feq a(int $$0) {
      return (feq)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frj {
      public static final MapCodec<fet.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(azn.B, Codec.FLOAT).fieldOf("advances").forGetter(fet.a::c)).apply($$0, fet.a::new)
      );

      @Override
      public frk a() {
         return frk.c;
      }

      @Override
      public Either<frj.b, frj.c> b() {
         frj.b $$0 = $$0x -> new fet(this.c);
         return Either.left($$0);
      }
   }
}
