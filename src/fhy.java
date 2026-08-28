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

public class fhy implements fhw {
   private final Int2ObjectMap<fhv.a> b;

   public fhy(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fhv.a)() -> $$1));
   }

   @Nullable
   @Override
   public fhv a(int $$0) {
      return (fhv)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fwd {
      public static final MapCodec<fhy.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.B, Codec.FLOAT).fieldOf("advances").forGetter(fhy.a::c)).apply($$0, fhy.a::new)
      );

      @Override
      public fwe a() {
         return fwe.c;
      }

      @Override
      public Either<fwd.b, fwd.c> b() {
         fwd.b $$0 = $$0x -> new fhy(this.c);
         return Either.left($$0);
      }
   }
}
