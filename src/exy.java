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

public class exy implements exw {
   private final Int2ObjectMap<exv.a> b;

   public exy(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (exv.a)() -> $$1));
   }

   @Nullable
   @Override
   public exv a(int $$0) {
      return (exv)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fkb {
      public static final MapCodec<exy.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayc.z, Codec.FLOAT).fieldOf("advances").forGetter(exy.a::c)).apply($$0, exy.a::new)
      );

      @Override
      public fkc a() {
         return fkc.c;
      }

      @Override
      public Either<fkb.b, fkb.c> b() {
         fkb.b $$0 = $$0x -> new exy(this.c);
         return Either.left($$0);
      }
   }
}
