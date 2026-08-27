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

public class ewx implements ewv {
   private final Int2ObjectMap<ewu.a> b;

   public ewx(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (ewu.a)() -> $$1));
   }

   @Nullable
   @Override
   public ewu a(int $$0) {
      return (ewu)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fjb {
      public static final MapCodec<ewx.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axm.x, Codec.FLOAT).fieldOf("advances").forGetter(ewx.a::c)).apply($$0, ewx.a::new)
      );

      @Override
      public fjc a() {
         return fjc.c;
      }

      @Override
      public Either<fjb.b, fjb.c> b() {
         fjb.b $$0 = $$0x -> new ewx(this.c);
         return Either.left($$0);
      }
   }
}
