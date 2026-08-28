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

public class fes implements feq {
   private final Int2ObjectMap<fep.a> b;

   public fes(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fep.a)() -> $$1));
   }

   @Nullable
   @Override
   public fep a(int $$0) {
      return (fep)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fri {
      public static final MapCodec<fes.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(azn.B, Codec.FLOAT).fieldOf("advances").forGetter(fes.a::c)).apply($$0, fes.a::new)
      );

      @Override
      public frj a() {
         return frj.c;
      }

      @Override
      public Either<fri.b, fri.c> b() {
         fri.b $$0 = $$0x -> new fes(this.c);
         return Either.left($$0);
      }
   }
}
