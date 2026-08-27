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

public class eni implements eng {
   private final Int2ObjectMap<enf.a> a;

   public eni(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (enf.a)() -> $$1));
   }

   @Nullable
   @Override
   public enf a(int $$0) {
      return (enf)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements ezg {
      public static final MapCodec<eni.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(atg.w, Codec.FLOAT).fieldOf("advances").forGetter(eni.a::c)).apply($$0, eni.a::new)
      );

      @Override
      public ezh a() {
         return ezh.c;
      }

      @Override
      public Either<ezg.a, ezg.b> b() {
         ezg.a $$0 = $$0x -> new eni(this.c);
         return Either.left($$0);
      }
   }
}
