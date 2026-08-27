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

public class ejw implements eju {
   private final Int2ObjectMap<ejt.a> a;

   public ejw(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ejt.a)() -> $$1));
   }

   @Nullable
   @Override
   public ejt a(int $$0) {
      return (ejt)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements evq {
      public static final MapCodec<ejw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(arh.w, Codec.FLOAT).fieldOf("advances").forGetter(ejw.a::c)).apply($$0, ejw.a::new)
      );

      @Override
      public evr a() {
         return evr.c;
      }

      @Override
      public Either<evq.a, evq.b> b() {
         evq.a $$0 = $$0x -> new ejw(this.c);
         return Either.left($$0);
      }
   }
}
