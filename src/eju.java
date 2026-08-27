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

public class eju implements ejs {
   private final Int2ObjectMap<ejr.a> a;

   public eju(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ejr.a)() -> $$1));
   }

   @Nullable
   @Override
   public ejr a(int $$0) {
      return (ejr)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements evo {
      public static final MapCodec<eju.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(arf.w, Codec.FLOAT).fieldOf("advances").forGetter(eju.a::c)).apply($$0, eju.a::new)
      );

      @Override
      public evp a() {
         return evp.c;
      }

      @Override
      public Either<evo.a, evo.b> b() {
         evo.a $$0 = $$0x -> new eju(this.c);
         return Either.left($$0);
      }
   }
}
