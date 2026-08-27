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

public class ewc implements ewa {
   private final Int2ObjectMap<evz.a> b;

   public ewc(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (evz.a)() -> $$1));
   }

   @Nullable
   @Override
   public evz a(int $$0) {
      return (evz)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fig {
      public static final MapCodec<ewc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axh.x, Codec.FLOAT).fieldOf("advances").forGetter(ewc.a::c)).apply($$0, ewc.a::new)
      );

      @Override
      public fih a() {
         return fih.c;
      }

      @Override
      public Either<fig.b, fig.c> b() {
         fig.b $$0 = $$0x -> new ewc(this.c);
         return Either.left($$0);
      }
   }
}
