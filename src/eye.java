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

public class eye implements eyc {
   private final Int2ObjectMap<eyb.a> b;

   public eye(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eyb.a)() -> $$1));
   }

   @Nullable
   @Override
   public eyb a(int $$0) {
      return (eyb)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fkh {
      public static final MapCodec<eye.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayh.z, Codec.FLOAT).fieldOf("advances").forGetter(eye.a::c)).apply($$0, eye.a::new)
      );

      @Override
      public fki a() {
         return fki.c;
      }

      @Override
      public Either<fkh.b, fkh.c> b() {
         fkh.b $$0 = $$0x -> new eye(this.c);
         return Either.left($$0);
      }
   }
}
