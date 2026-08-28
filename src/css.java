import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record css<T>(T a, iv b) {
   public css(T $$0, ale $$1) {
      this($$0, new iv($$1));
   }

   public static <T> MapCodec<css<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(css::a), iv.b.forGetter(css::b)).apply($$2, css::new));
   }

   public static <T> yu<wh, css<T>> a(yu<? super wh, T> $$0) {
      return yu.a($$0, css::a, iv.c, css::b, css::new);
   }
}
