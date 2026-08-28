import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ecs implements ecq {
   protected final List<ecq> e;

   protected ecs(List<ecq> $$0) {
      this.e = $$0;
   }

   public static <T extends ecs> MapCodec<T> a(Function<List<ecq>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ecq.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
