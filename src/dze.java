import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dze implements dzc {
   protected final List<dzc> e;

   protected dze(List<dzc> $$0) {
      this.e = $$0;
   }

   public static <T extends dze> MapCodec<T> a(Function<List<dzc>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dzc.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
