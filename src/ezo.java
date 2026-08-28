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

public class ezo implements ezm {
   private final Int2ObjectMap<ezl.a> b;

   public ezo(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (ezl.a)() -> $$1));
   }

   @Nullable
   @Override
   public ezl a(int $$0) {
      return (ezl)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements flo {
      public static final MapCodec<ezo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(axw.z, Codec.FLOAT).fieldOf("advances").forGetter(ezo.a::c)).apply($$0, ezo.a::new)
      );

      @Override
      public flp a() {
         return flp.c;
      }

      @Override
      public Either<flo.b, flo.c> b() {
         flo.b $$0 = $$0x -> new ezo(this.c);
         return Either.left($$0);
      }
   }
}
