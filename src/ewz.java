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

public class ewz implements ewx {
   private final Int2ObjectMap<eww.a> b;

   public ewz(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eww.a)() -> $$1));
   }

   @Nullable
   @Override
   public eww a(int $$0) {
      return (eww)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fjc {
      public static final MapCodec<ewz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axn.x, Codec.FLOAT).fieldOf("advances").forGetter(ewz.a::c)).apply($$0, ewz.a::new)
      );

      @Override
      public fjd a() {
         return fjd.c;
      }

      @Override
      public Either<fjc.b, fjc.c> b() {
         fjc.b $$0 = $$0x -> new ewz(this.c);
         return Either.left($$0);
      }
   }
}
