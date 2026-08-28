import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzc implements dza {
   protected final List<dza> e;

   protected dzc(List<dza> $$0) {
      this.e = $$0;
   }

   public static <T extends dzc> MapCodec<T> a(Function<List<dza>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dza.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
