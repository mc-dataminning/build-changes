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

public class eoe implements eoc {
   private final Int2ObjectMap<eob.a> a;

   public eoe(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (eob.a)() -> $$1));
   }

   @Nullable
   @Override
   public eob a(int $$0) {
      return (eob)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fad {
      public static final MapCodec<eoe.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(atv.w, Codec.FLOAT).fieldOf("advances").forGetter(eoe.a::c)).apply($$0, eoe.a::new)
      );

      @Override
      public fae a() {
         return fae.c;
      }

      @Override
      public Either<fad.a, fad.b> b() {
         fad.a $$0 = $$0x -> new eoe(this.c);
         return Either.left($$0);
      }
   }
}
