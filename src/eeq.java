import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class eeq {
   public static final Codec<eeq> a = lq.Y.r().dispatch(eeq::b, eer::a);
   protected static final int b = 16;
   protected final OptionalInt c;

   protected static <S extends eeq> RecordCodecBuilder<S, OptionalInt> a() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap($$0 -> $$0.map(OptionalInt::of).orElse(OptionalInt.empty()), $$0 -> $$0.isPresent() ? Optional.of($$0.getAsInt()) : Optional.empty())
         .forGetter($$0 -> $$0.c);
   }

   public eeq(OptionalInt $$0) {
      this.c = $$0;
   }

   protected abstract eer<?> b();

   public abstract int a(int var1, int var2);

   public OptionalInt c() {
      return this.c;
   }
}
