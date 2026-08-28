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

public class fbf implements fbd {
   private final Int2ObjectMap<fbc.a> b;

   public fbf(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fbc.a)() -> $$1));
   }

   @Nullable
   @Override
   public fbc a(int $$0) {
      return (fbc)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fnn {
      public static final MapCodec<fbf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(aym.A, Codec.FLOAT).fieldOf("advances").forGetter(fbf.a::c)).apply($$0, fbf.a::new)
      );

      @Override
      public fno a() {
         return fno.c;
      }

      @Override
      public Either<fnn.b, fnn.c> b() {
         fnn.b $$0 = $$0x -> new fbf(this.c);
         return Either.left($$0);
      }
   }
}
