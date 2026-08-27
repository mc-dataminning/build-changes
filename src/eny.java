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

public class eny implements enw {
   private final Int2ObjectMap<env.a> a;

   public eny(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (env.a)() -> $$1));
   }

   @Nullable
   @Override
   public env a(int $$0) {
      return (env)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements ezx {
      public static final MapCodec<eny.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(atq.w, Codec.FLOAT).fieldOf("advances").forGetter(eny.a::c)).apply($$0, eny.a::new)
      );

      @Override
      public ezy a() {
         return ezy.c;
      }

      @Override
      public Either<ezx.a, ezx.b> b() {
         ezx.a $$0 = $$0x -> new eny(this.c);
         return Either.left($$0);
      }
   }
}
