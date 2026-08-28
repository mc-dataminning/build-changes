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

public class fcs implements fcq {
   private final Int2ObjectMap<fcp.a> b;

   public fcs(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fcp.a)() -> $$1));
   }

   @Nullable
   @Override
   public fcp a(int $$0) {
      return (fcp)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fph {
      public static final MapCodec<fcs.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayv.B, Codec.FLOAT).fieldOf("advances").forGetter(fcs.a::c)).apply($$0, fcs.a::new)
      );

      @Override
      public fpi a() {
         return fpi.c;
      }

      @Override
      public Either<fph.b, fph.c> b() {
         fph.b $$0 = $$0x -> new fcs(this.c);
         return Either.left($$0);
      }
   }
}
