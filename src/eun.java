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

public class eun implements eul {
   private final Int2ObjectMap<euk.a> b;

   public eun(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (euk.a)() -> $$1));
   }

   @Nullable
   @Override
   public euk a(int $$0) {
      return (euk)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public static record a(Map<Integer, Float> c) implements fgr {
      public static final MapCodec<eun.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(aws.x, Codec.FLOAT).fieldOf("advances").forGetter(eun.a::c)).apply($$0, eun.a::new)
      );

      @Override
      public fgs a() {
         return fgs.c;
      }

      @Override
      public Either<fgr.b, fgr.c> b() {
         fgr.b $$0 = $$0x -> new eun(this.c);
         return Either.left($$0);
      }
   }
}
