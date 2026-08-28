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

public class faq implements fao {
   private final Int2ObjectMap<fan.a> b;

   public faq(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (fan.a)() -> $$1));
   }

   @Nullable
   @Override
   public fan a(int $$0) {
      return (fan)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fnd {
      public static final MapCodec<faq.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayl.z, Codec.FLOAT).fieldOf("advances").forGetter(faq.a::c)).apply($$0, faq.a::new)
      );

      @Override
      public fne a() {
         return fne.c;
      }

      @Override
      public Either<fnd.b, fnd.c> b() {
         fnd.b $$0 = $$0x -> new faq(this.c);
         return Either.left($$0);
      }
   }
}
