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

public class eyc implements eya {
   private final Int2ObjectMap<exz.a> b;

   public eyc(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (exz.a)() -> $$1));
   }

   @Nullable
   @Override
   public exz a(int $$0) {
      return (exz)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fkf {
      public static final MapCodec<eyc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayg.z, Codec.FLOAT).fieldOf("advances").forGetter(eyc.a::c)).apply($$0, eyc.a::new)
      );

      @Override
      public fkg a() {
         return fkg.c;
      }

      @Override
      public Either<fkf.b, fkf.c> b() {
         fkf.b $$0 = $$0x -> new eyc(this.c);
         return Either.left($$0);
      }
   }
}
