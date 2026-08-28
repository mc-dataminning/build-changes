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

public class eyf implements eyd {
   private final Int2ObjectMap<eyc.a> b;

   public eyf(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eyc.a)() -> $$1));
   }

   @Nullable
   @Override
   public eyc a(int $$0) {
      return (eyc)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fki {
      public static final MapCodec<eyf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayh.z, Codec.FLOAT).fieldOf("advances").forGetter(eyf.a::c)).apply($$0, eyf.a::new)
      );

      @Override
      public fkj a() {
         return fkj.c;
      }

      @Override
      public Either<fki.b, fki.c> b() {
         fki.b $$0 = $$0x -> new eyf(this.c);
         return Either.left($$0);
      }
   }
}
