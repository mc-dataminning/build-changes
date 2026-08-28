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

public class fht implements fhr {
   private final Int2ObjectMap<fhq.a> b;

   public fht(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fhq.a)() -> $$1));
   }

   @Nullable
   @Override
   public fhq a(int $$0) {
      return (fhq)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fvy {
      public static final MapCodec<fht.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayu.B, Codec.FLOAT).fieldOf("advances").forGetter(fht.a::c)).apply($$0, fht.a::new)
      );

      @Override
      public fvz a() {
         return fvz.c;
      }

      @Override
      public Either<fvy.b, fvy.c> b() {
         fvy.b $$0 = $$0x -> new fht(this.c);
         return Either.left($$0);
      }
   }
}
