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

public class fbj implements fbh {
   private final Int2ObjectMap<fbg.a> b;

   public fbj(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fbg.a)() -> $$1));
   }

   @Nullable
   @Override
   public fbg a(int $$0) {
      return (fbg)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fnr {
      public static final MapCodec<fbj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayo.A, Codec.FLOAT).fieldOf("advances").forGetter(fbj.a::c)).apply($$0, fbj.a::new)
      );

      @Override
      public fns a() {
         return fns.c;
      }

      @Override
      public Either<fnr.b, fnr.c> b() {
         fnr.b $$0 = $$0x -> new fbj(this.c);
         return Either.left($$0);
      }
   }
}
