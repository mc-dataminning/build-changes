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

public class ezh implements ezf {
   private final Int2ObjectMap<eze.a> b;

   public ezh(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eze.a)() -> $$1));
   }

   @Nullable
   @Override
   public eze a(int $$0) {
      return (eze)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements flp {
      public static final MapCodec<ezh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axu.y, Codec.FLOAT).fieldOf("advances").forGetter(ezh.a::c)).apply($$0, ezh.a::new)
      );

      @Override
      public flq a() {
         return flq.c;
      }

      @Override
      public Either<flp.b, flp.c> b() {
         flp.b $$0 = $$0x -> new ezh(this.c);
         return Either.left($$0);
      }
   }
}
