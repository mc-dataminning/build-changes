import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class efu implements efs {
   protected final List<efs> e;

   protected efu(List<efs> $$0) {
      this.e = $$0;
   }

   public static <T extends efu> MapCodec<T> a(Function<List<efs>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(efs.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
