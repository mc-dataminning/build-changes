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

public class eof implements eod {
   private final Int2ObjectMap<eoc.a> a;

   public eof(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (eoc.a)() -> $$1));
   }

   @Nullable
   @Override
   public eoc a(int $$0) {
      return (eoc)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fae {
      public static final MapCodec<eof.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(atv.w, Codec.FLOAT).fieldOf("advances").forGetter(eof.a::c)).apply($$0, eof.a::new)
      );

      @Override
      public faf a() {
         return faf.c;
      }

      @Override
      public Either<fae.a, fae.b> b() {
         fae.a $$0 = $$0x -> new eof(this.c);
         return Either.left($$0);
      }
   }
}
