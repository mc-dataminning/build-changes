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

public class fdt implements fdr {
   private final Int2ObjectMap<fdq.a> b;

   public fdt(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fdq.a)() -> $$1));
   }

   @Nullable
   @Override
   public fdq a(int $$0) {
      return (fdq)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frt {
      public static final MapCodec<fdt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayh.B, Codec.FLOAT).fieldOf("advances").forGetter(fdt.a::c)).apply($$0, fdt.a::new)
      );

      @Override
      public fru a() {
         return fru.c;
      }

      @Override
      public Either<frt.b, frt.c> b() {
         frt.b $$0 = $$0x -> new fdt(this.c);
         return Either.left($$0);
      }
   }
}
