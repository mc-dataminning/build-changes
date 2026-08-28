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

public class eyb implements exz {
   private final Int2ObjectMap<exy.a> b;

   public eyb(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (exy.a)() -> $$1));
   }

   @Nullable
   @Override
   public exy a(int $$0) {
      return (exy)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fke {
      public static final MapCodec<eyb.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(ayf.z, Codec.FLOAT).fieldOf("advances").forGetter(eyb.a::c)).apply($$0, eyb.a::new)
      );

      @Override
      public fkf a() {
         return fkf.c;
      }

      @Override
      public Either<fke.b, fke.c> b() {
         fke.b $$0 = $$0x -> new eyb(this.c);
         return Either.left($$0);
      }
   }
}
