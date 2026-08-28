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

public class fbu implements fbs {
   private final Int2ObjectMap<fbr.a> b;

   public fbu(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fbr.a)() -> $$1));
   }

   @Nullable
   @Override
   public fbr a(int $$0) {
      return (fbr)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements foc {
      public static final MapCodec<fbu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ays.B, Codec.FLOAT).fieldOf("advances").forGetter(fbu.a::c)).apply($$0, fbu.a::new)
      );

      @Override
      public fod a() {
         return fod.c;
      }

      @Override
      public Either<foc.b, foc.c> b() {
         foc.b $$0 = $$0x -> new fbu(this.c);
         return Either.left($$0);
      }
   }
}
