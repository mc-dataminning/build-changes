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

public class fiu implements fis {
   private final Int2ObjectMap<fir.a> b;

   public fiu(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fir.a)() -> $$1));
   }

   @Nullable
   @Override
   public fir a(int $$0) {
      return (fir)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fxb {
      public static final MapCodec<fiu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(azg.B, Codec.FLOAT).fieldOf("advances").forGetter(fiu.a::c)).apply($$0, fiu.a::new)
      );

      @Override
      public fxc a() {
         return fxc.c;
      }

      @Override
      public Either<fxb.b, fxb.c> b() {
         fxb.b $$0 = $$0x -> new fiu(this.c);
         return Either.left($$0);
      }
   }
}
