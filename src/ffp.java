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

public class ffp implements ffn {
   private final Int2ObjectMap<ffm.a> b;

   public ffp(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (ffm.a)() -> $$1));
   }

   @Nullable
   @Override
   public ffm a(int $$0) {
      return (ffm)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements ftq {
      public static final MapCodec<ffp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ays.B, Codec.FLOAT).fieldOf("advances").forGetter(ffp.a::c)).apply($$0, ffp.a::new)
      );

      @Override
      public ftr a() {
         return ftr.c;
      }

      @Override
      public Either<ftq.b, ftq.c> b() {
         ftq.b $$0 = $$0x -> new ffp(this.c);
         return Either.left($$0);
      }
   }
}
