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

public class ejp implements ejn {
   private final Int2ObjectMap<ejm.a> a;

   public ejp(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ejm.a)() -> $$1));
   }

   @Nullable
   @Override
   public ejm a(int $$0) {
      return (ejm)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements evj {
      public static final MapCodec<ejp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(arb.v, Codec.FLOAT).fieldOf("advances").forGetter(ejp.a::c)).apply($$0, ejp.a::new)
      );

      @Override
      public evk a() {
         return evk.c;
      }

      @Override
      public Either<evj.a, evj.b> b() {
         evj.a $$0 = $$0x -> new ejp(this.c);
         return Either.left($$0);
      }
   }
}
