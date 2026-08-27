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

public class euw implements euu {
   private final Int2ObjectMap<eut.a> b;

   public euw(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eut.a)() -> $$1));
   }

   @Nullable
   @Override
   public eut a(int $$0) {
      return (eut)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fha {
      public static final MapCodec<euw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(awu.x, Codec.FLOAT).fieldOf("advances").forGetter(euw.a::c)).apply($$0, euw.a::new)
      );

      @Override
      public fhb a() {
         return fhb.c;
      }

      @Override
      public Either<fha.b, fha.c> b() {
         fha.b $$0 = $$0x -> new euw(this.c);
         return Either.left($$0);
      }
   }
}
