import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csy<T>(T a, iv b) {
   public csy(T $$0, alg $$1) {
      this($$0, new iv($$1));
   }

   public static <T> MapCodec<csy<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(csy::a), iv.b.forGetter(csy::b)).apply($$2, csy::new));
   }

   public static <T> yw<wj, csy<T>> a(yw<? super wj, T> $$0) {
      return yw.a($$0, csy::a, iv.c, csy::b, csy::new);
   }
}
