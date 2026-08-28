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

public class fdu implements fds {
   private final Int2ObjectMap<fdr.a> b;

   public fdu(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fdr.a)() -> $$1));
   }

   @Nullable
   @Override
   public fdr a(int $$0) {
      return (fdr)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements frv {
      public static final MapCodec<fdu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayi.B, Codec.FLOAT).fieldOf("advances").forGetter(fdu.a::c)).apply($$0, fdu.a::new)
      );

      @Override
      public frw a() {
         return frw.c;
      }

      @Override
      public Either<frv.b, frv.c> b() {
         frv.b $$0 = $$0x -> new fdu(this.c);
         return Either.left($$0);
      }
   }
}
