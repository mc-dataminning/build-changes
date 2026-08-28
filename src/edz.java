import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class edz implements edx {
   protected final List<edx> e;

   protected edz(List<edx> $$0) {
      this.e = $$0;
   }

   public static <T extends edz> MapCodec<T> a(Function<List<edx>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(edx.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
