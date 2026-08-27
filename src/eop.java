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

public class eop implements eon {
   private final Int2ObjectMap<eom.a> a;

   public eop(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (eom.a)() -> $$1));
   }

   @Nullable
   @Override
   public eom a(int $$0) {
      return (eom)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements faq {
      public static final MapCodec<eop.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(atx.w, Codec.FLOAT).fieldOf("advances").forGetter(eop.a::c)).apply($$0, eop.a::new)
      );

      @Override
      public far a() {
         return far.c;
      }

      @Override
      public Either<faq.a, faq.b> b() {
         faq.a $$0 = $$0x -> new eop(this.c);
         return Either.left($$0);
      }
   }
}
