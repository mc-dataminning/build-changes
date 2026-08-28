import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctk<T>(T a, iw b) {
   public ctk(T $$0, alg $$1) {
      this($$0, new iw($$1));
   }

   public static <T> MapCodec<ctk<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(ctk::a), iw.b.forGetter(ctk::b)).apply($$2, ctk::new));
   }

   public static <T> yw<wj, ctk<T>> a(yw<? super wj, T> $$0) {
      return yw.a($$0, ctk::a, iw.c, ctk::b, ctk::new);
   }
}
