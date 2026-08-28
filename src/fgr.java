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

public class fgr implements fgp {
   private final Int2ObjectMap<fgo.a> b;

   public fgr(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fgo.a)() -> $$1));
   }

   @Nullable
   @Override
   public fgo a(int $$0) {
      return (fgo)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fut {
      public static final MapCodec<fgr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ays.B, Codec.FLOAT).fieldOf("advances").forGetter(fgr.a::c)).apply($$0, fgr.a::new)
      );

      @Override
      public fuu a() {
         return fuu.c;
      }

      @Override
      public Either<fut.b, fut.c> b() {
         fut.b $$0 = $$0x -> new fgr(this.c);
         return Either.left($$0);
      }
   }
}
