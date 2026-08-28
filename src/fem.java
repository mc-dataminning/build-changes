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

public class fem implements fek {
   private final Int2ObjectMap<fej.a> b;

   public fem(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fej.a)() -> $$1));
   }

   @Nullable
   @Override
   public fej a(int $$0) {
      return (fej)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frc {
      public static final MapCodec<fem.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(azn.B, Codec.FLOAT).fieldOf("advances").forGetter(fem.a::c)).apply($$0, fem.a::new)
      );

      @Override
      public frd a() {
         return frd.c;
      }

      @Override
      public Either<frc.b, frc.c> b() {
         frc.b $$0 = $$0x -> new fem(this.c);
         return Either.left($$0);
      }
   }
}
