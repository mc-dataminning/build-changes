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

public class fdv implements fdt {
   private final Int2ObjectMap<fds.a> b;

   public fdv(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fds.a)() -> $$1));
   }

   @Nullable
   @Override
   public fds a(int $$0) {
      return (fds)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frv {
      public static final MapCodec<fdv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayi.B, Codec.FLOAT).fieldOf("advances").forGetter(fdv.a::c)).apply($$0, fdv.a::new)
      );

      @Override
      public frw a() {
         return frw.c;
      }

      @Override
      public Either<frv.b, frv.c> b() {
         frv.b $$0 = $$0x -> new fdv(this.c);
         return Either.left($$0);
      }
   }
}
