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

public class emb implements elz {
   private final Int2ObjectMap<ely.a> a;

   public emb(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ely.a)() -> $$1));
   }

   @Nullable
   @Override
   public ely a(int $$0) {
      return (ely)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements exy {
      public static final MapCodec<emb.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(asu.w, Codec.FLOAT).fieldOf("advances").forGetter(emb.a::c)).apply($$0, emb.a::new)
      );

      @Override
      public exz a() {
         return exz.c;
      }

      @Override
      public Either<exy.a, exy.b> b() {
         exy.a $$0 = $$0x -> new emb(this.c);
         return Either.left($$0);
      }
   }
}
