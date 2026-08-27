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

public class eqm implements eqk {
   private final Int2ObjectMap<eqj.a> b;

   public eqm(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (eqj.a)() -> $$1));
   }

   @Nullable
   @Override
   public eqj a(int $$0) {
      return (eqj)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fcp {
      public static final MapCodec<eqm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(avq.w, Codec.FLOAT).fieldOf("advances").forGetter(eqm.a::c)).apply($$0, eqm.a::new)
      );

      @Override
      public fcq a() {
         return fcq.c;
      }

      @Override
      public Either<fcp.a, fcp.b> b() {
         fcp.a $$0 = $$0x -> new eqm(this.c);
         return Either.left($$0);
      }
   }
}
