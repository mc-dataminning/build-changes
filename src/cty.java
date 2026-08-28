import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cty<T>(T a, iw b) {
   public cty(T $$0, ali $$1) {
      this($$0, new iw($$1));
   }

   public static <T> MapCodec<cty<T>> a(Codec<T> $$0, T $$1) {
      return RecordCodecBuilder.mapCodec($$2 -> $$2.group($$0.optionalFieldOf("model", $$1).forGetter(cty::a), iw.b.forGetter(cty::b)).apply($$2, cty::new));
   }

   public static <T> yy<wl, cty<T>> a(yy<? super wl, T> $$0) {
      return yy.a($$0, cty::a, iw.c, cty::b, cty::new);
   }
}
