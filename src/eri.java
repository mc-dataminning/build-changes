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

public class eri implements erg {
   private final Int2ObjectMap<erf.a> b;

   public eri(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (erf.a)() -> $$1));
   }

   @Nullable
   @Override
   public erf a(int $$0) {
      return (erf)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fdl {
      public static final MapCodec<eri.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(avu.w, Codec.FLOAT).fieldOf("advances").forGetter(eri.a::c)).apply($$0, eri.a::new)
      );

      @Override
      public fdm a() {
         return fdm.c;
      }

      @Override
      public Either<fdl.a, fdl.b> b() {
         fdl.a $$0 = $$0x -> new eri(this.c);
         return Either.left($$0);
      }
   }
}
