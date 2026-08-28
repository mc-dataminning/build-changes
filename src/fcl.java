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

public class fcl implements fcj {
   private final Int2ObjectMap<fci.a> b;

   public fcl(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fci.a)() -> $$1));
   }

   @Nullable
   @Override
   public fci a(int $$0) {
      return (fci)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fpa {
      public static final MapCodec<fcl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayw.B, Codec.FLOAT).fieldOf("advances").forGetter(fcl.a::c)).apply($$0, fcl.a::new)
      );

      @Override
      public fpb a() {
         return fpb.c;
      }

      @Override
      public Either<fpa.b, fpa.c> b() {
         fpa.b $$0 = $$0x -> new fcl(this.c);
         return Either.left($$0);
      }
   }
}
