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

public class eyd implements eyb {
   private final Int2ObjectMap<eya.a> b;

   public eyd(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eya.a)() -> $$1));
   }

   @Nullable
   @Override
   public eya a(int $$0) {
      return (eya)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fkg {
      public static final MapCodec<eyd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayh.z, Codec.FLOAT).fieldOf("advances").forGetter(eyd.a::c)).apply($$0, eyd.a::new)
      );

      @Override
      public fkh a() {
         return fkh.c;
      }

      @Override
      public Either<fkg.b, fkg.c> b() {
         fkg.b $$0 = $$0x -> new eyd(this.c);
         return Either.left($$0);
      }
   }
}
