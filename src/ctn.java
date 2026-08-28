import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctn<T>(T a, iw b) {
   public ctn(T $$0, alg $$1) {
      this($$0, new iw($$1));
   }

   public static <T> MapCodec<ctn<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(ctn::a), iw.b.forGetter(ctn::b)).apply($$2, ctn::new));
   }

   public static <T> yw<wj, ctn<T>> a(yw<? super wj, T> $$0) {
      return yw.a($$0, ctn::a, iw.c, ctn::b, ctn::new);
   }
}
