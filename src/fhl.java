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

public class fhl implements fhj {
   private final Int2ObjectMap<fhi.a> b;

   public fhl(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fhi.a)() -> $$1));
   }

   @Nullable
   @Override
   public fhi a(int $$0) {
      return (fhi)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fvm {
      public static final MapCodec<fhl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.B, Codec.FLOAT).fieldOf("advances").forGetter(fhl.a::c)).apply($$0, fhl.a::new)
      );

      @Override
      public fvn a() {
         return fvn.c;
      }

      @Override
      public Either<fvm.b, fvm.c> b() {
         fvm.b $$0 = $$0x -> new fhl(this.c);
         return Either.left($$0);
      }
   }
}
