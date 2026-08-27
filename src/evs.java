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

public class evs implements evq {
   private final Int2ObjectMap<evp.a> b;

   public evs(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (evp.a)() -> $$1));
   }

   @Nullable
   @Override
   public evp a(int $$0) {
      return (evp)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fhw {
      public static final MapCodec<evs.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axe.x, Codec.FLOAT).fieldOf("advances").forGetter(evs.a::c)).apply($$0, evs.a::new)
      );

      @Override
      public fhx a() {
         return fhx.c;
      }

      @Override
      public Either<fhw.b, fhw.c> b() {
         fhw.b $$0 = $$0x -> new evs(this.c);
         return Either.left($$0);
      }
   }
}
