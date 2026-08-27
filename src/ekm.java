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

public class ekm implements ekk {
   private final Int2ObjectMap<ekj.a> a;

   public ekm(Map<Integer, Float> $$0) {
      this.a = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.a.put($$0x, (ekj.a)() -> $$1));
   }

   @Nullable
   @Override
   public ekj a(int $$0) {
      return (ekj)this.a.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.a.keySet());
   }

   public static record a(Map<Integer, Float> c) implements ewi {
      public static final MapCodec<ekm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(asg.w, Codec.FLOAT).fieldOf("advances").forGetter(ekm.a::c)).apply($$0, ekm.a::new)
      );

      @Override
      public ewj a() {
         return ewj.c;
      }

      @Override
      public Either<ewi.a, ewi.b> b() {
         ewi.a $$0 = $$0x -> new ekm(this.c);
         return Either.left($$0);
      }
   }
}
