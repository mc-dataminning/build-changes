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

public class elp implements eln {
   private final Int2ObjectMap<elm.a> a;

   public elp(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (elm.a)() -> $$1));
   }

   @Nullable
   @Override
   public elm a(int $$0) {
      return (elm)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements exl {
      public static final MapCodec<elp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(asq.w, Codec.FLOAT).fieldOf("advances").forGetter(elp.a::c)).apply($$0, elp.a::new)
      );

      @Override
      public exm a() {
         return exm.c;
      }

      @Override
      public Either<exl.a, exl.b> b() {
         exl.a $$0 = $$0x -> new elp(this.c);
         return Either.left($$0);
      }
   }
}
