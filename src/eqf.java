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

public class eqf implements eqd {
   private final Int2ObjectMap<eqc.a> b;

   public eqf(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eqc.a)() -> $$1));
   }

   @Nullable
   @Override
   public eqc a(int $$0) {
      return (eqc)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fci {
      public static final MapCodec<eqf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(avp.w, Codec.FLOAT).fieldOf("advances").forGetter(eqf.a::c)).apply($$0, eqf.a::new)
      );

      @Override
      public fcj a() {
         return fcj.c;
      }

      @Override
      public Either<fci.a, fci.b> b() {
         fci.a $$0 = $$0x -> new eqf(this.c);
         return Either.left($$0);
      }
   }
}
