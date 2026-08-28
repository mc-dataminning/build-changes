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

public class fhd implements fhb {
   private final Int2ObjectMap<fha.a> b;

   public fhd(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fha.a)() -> $$1));
   }

   @Nullable
   @Override
   public fha a(int $$0) {
      return (fha)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fvf {
      public static final MapCodec<fhd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.B, Codec.FLOAT).fieldOf("advances").forGetter(fhd.a::c)).apply($$0, fhd.a::new)
      );

      @Override
      public fvg a() {
         return fvg.c;
      }

      @Override
      public Either<fvf.b, fvf.c> b() {
         fvf.b $$0 = $$0x -> new fhd(this.c);
         return Either.left($$0);
      }
   }
}
