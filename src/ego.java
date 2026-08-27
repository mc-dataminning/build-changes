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

public class ego implements egm {
   private final Int2ObjectMap<egl.a> a;

   public ego(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (egl.a)() -> $$1));
   }

   @Nullable
   @Override
   public egl a(int $$0) {
      return (egl)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements erx {
      public static final MapCodec<ego.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(aoi.v, Codec.FLOAT).fieldOf("advances").forGetter(ego.a::c)).apply($$0, ego.a::new)
      );

      @Override
      public ery a() {
         return ery.c;
      }

      @Override
      public Either<erx.a, erx.b> b() {
         erx.a $$0 = $$0x -> new ego(this.c);
         return Either.left($$0);
      }
   }
}
