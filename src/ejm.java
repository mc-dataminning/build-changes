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

public class ejm implements ejk {
   private final Int2ObjectMap<ejj.a> a;

   public ejm(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ejj.a)() -> $$1));
   }

   @Nullable
   @Override
   public ejj a(int $$0) {
      return (ejj)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements eva {
      public static final MapCodec<ejm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(aqw.v, Codec.FLOAT).fieldOf("advances").forGetter(ejm.a::c)).apply($$0, ejm.a::new)
      );

      @Override
      public evb a() {
         return evb.c;
      }

      @Override
      public Either<eva.a, eva.b> b() {
         eva.a $$0 = $$0x -> new ejm(this.c);
         return Either.left($$0);
      }
   }
}
