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

public class eyr implements eyp {
   private final Int2ObjectMap<eyo.a> b;

   public eyr(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eyo.a)() -> $$1));
   }

   @Nullable
   @Override
   public eyo a(int $$0) {
      return (eyo)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fku {
      public static final MapCodec<eyr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axo.z, Codec.FLOAT).fieldOf("advances").forGetter(eyr.a::c)).apply($$0, eyr.a::new)
      );

      @Override
      public fkv a() {
         return fkv.c;
      }

      @Override
      public Either<fku.b, fku.c> b() {
         fku.b $$0 = $$0x -> new eyr(this.c);
         return Either.left($$0);
      }
   }
}
