import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eea implements edy {
   protected final List<edy> e;

   protected eea(List<edy> $$0) {
      this.e = $$0;
   }

   public static <T extends eea> MapCodec<T> a(Function<List<edy>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(edy.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
