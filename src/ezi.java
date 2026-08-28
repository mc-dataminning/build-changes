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

public class ezi implements ezg {
   private final Int2ObjectMap<ezf.a> b;

   public ezi(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (ezf.a)() -> $$1));
   }

   @Nullable
   @Override
   public ezf a(int $$0) {
      return (ezf)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fli {
      public static final MapCodec<ezi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axv.z, Codec.FLOAT).fieldOf("advances").forGetter(ezi.a::c)).apply($$0, ezi.a::new)
      );

      @Override
      public flj a() {
         return flj.c;
      }

      @Override
      public Either<fli.b, fli.c> b() {
         fli.b $$0 = $$0x -> new ezi(this.c);
         return Either.left($$0);
      }
   }
}
