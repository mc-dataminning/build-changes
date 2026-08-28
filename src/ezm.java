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

public class ezm implements ezk {
   private final Int2ObjectMap<ezj.a> b;

   public ezm(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (ezj.a)() -> $$1));
   }

   @Nullable
   @Override
   public ezj a(int $$0) {
      return (ezj)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements flm {
      public static final MapCodec<ezm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axw.z, Codec.FLOAT).fieldOf("advances").forGetter(ezm.a::c)).apply($$0, ezm.a::new)
      );

      @Override
      public fln a() {
         return fln.c;
      }

      @Override
      public Either<flm.b, flm.c> b() {
         flm.b $$0 = $$0x -> new ezm(this.c);
         return Either.left($$0);
      }
   }
}
