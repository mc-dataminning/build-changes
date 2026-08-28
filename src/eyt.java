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

public class eyt implements eyr {
   private final Int2ObjectMap<eyq.a> b;

   public eyt(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eyq.a)() -> $$1));
   }

   @Nullable
   @Override
   public eyq a(int $$0) {
      return (eyq)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fkw {
      public static final MapCodec<eyt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axo.z, Codec.FLOAT).fieldOf("advances").forGetter(eyt.a::c)).apply($$0, eyt.a::new)
      );

      @Override
      public fkx a() {
         return fkx.c;
      }

      @Override
      public Either<fkw.b, fkw.c> b() {
         fkw.b $$0 = $$0x -> new eyt(this.c);
         return Either.left($$0);
      }
   }
}
