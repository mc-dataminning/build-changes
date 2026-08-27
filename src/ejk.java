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

public class ejk implements eji {
   private final Int2ObjectMap<ejh.a> a;

   public ejk(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ejh.a)() -> $$1));
   }

   @Nullable
   @Override
   public ejh a(int $$0) {
      return (ejh)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements eve {
      public static final MapCodec<ejk.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(aqy.v, Codec.FLOAT).fieldOf("advances").forGetter(ejk.a::c)).apply($$0, ejk.a::new)
      );

      @Override
      public evf a() {
         return evf.c;
      }

      @Override
      public Either<eve.a, eve.b> b() {
         eve.a $$0 = $$0x -> new ejk(this.c);
         return Either.left($$0);
      }
   }
}
