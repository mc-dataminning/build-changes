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

public class emg implements eme {
   private final Int2ObjectMap<emd.a> a;

   public emg(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (emd.a)() -> $$1));
   }

   @Nullable
   @Override
   public emd a(int $$0) {
      return (emd)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements eyd {
      public static final MapCodec<emg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(asy.w, Codec.FLOAT).fieldOf("advances").forGetter(emg.a::c)).apply($$0, emg.a::new)
      );

      @Override
      public eye a() {
         return eye.c;
      }

      @Override
      public Either<eyd.a, eyd.b> b() {
         eyd.a $$0 = $$0x -> new emg(this.c);
         return Either.left($$0);
      }
   }
}
