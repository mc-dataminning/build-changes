import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctd<T>(T a, iv b) {
   public ctd(T $$0, alg $$1) {
      this($$0, new iv($$1));
   }

   public static <T> MapCodec<ctd<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(ctd::a), iv.b.forGetter(ctd::b)).apply($$2, ctd::new));
   }

   public static <T> yw<wj, ctd<T>> a(yw<? super wj, T> $$0) {
      return yw.a($$0, ctd::a, iv.c, ctd::b, ctd::new);
   }
}
