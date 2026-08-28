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

public class fim implements fik {
   private final Int2ObjectMap<fij.a> b;

   public fim(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fij.a)() -> $$1));
   }

   @Nullable
   @Override
   public fij a(int $$0) {
      return (fij)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fxo {
      public static final MapCodec<fim.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayw.B, Codec.FLOAT).fieldOf("advances").forGetter(fim.a::c)).apply($$0, fim.a::new)
      );

      @Override
      public fxp a() {
         return fxp.c;
      }

      @Override
      public Either<fxo.b, fxo.c> b() {
         fxo.b $$0 = $$0x -> new fim(this.c);
         return Either.left($$0);
      }
   }
}
