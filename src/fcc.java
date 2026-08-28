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

public class fcc implements fca {
   private final Int2ObjectMap<fbz.a> b;

   public fcc(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fbz.a)() -> $$1));
   }

   @Nullable
   @Override
   public fbz a(int $$0) {
      return (fbz)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fok {
      public static final MapCodec<fcc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayt.B, Codec.FLOAT).fieldOf("advances").forGetter(fcc.a::c)).apply($$0, fcc.a::new)
      );

      @Override
      public fol a() {
         return fol.c;
      }

      @Override
      public Either<fok.b, fok.c> b() {
         fok.b $$0 = $$0x -> new fcc(this.c);
         return Either.left($$0);
      }
   }
}
