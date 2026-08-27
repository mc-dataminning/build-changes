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

public class esg implements ese {
   private final Int2ObjectMap<esd.a> b;

   public esg(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (esd.a)() -> $$1));
   }

   @Nullable
   @Override
   public esd a(int $$0) {
      return (esd)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fek {
      public static final MapCodec<esg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(awe.x, Codec.FLOAT).fieldOf("advances").forGetter(esg.a::c)).apply($$0, esg.a::new)
      );

      @Override
      public fel a() {
         return fel.c;
      }

      @Override
      public Either<fek.b, fek.c> b() {
         fek.b $$0 = $$0x -> new esg(this.c);
         return Either.left($$0);
      }
   }
}
