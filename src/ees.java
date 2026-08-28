import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ees implements eeq {
   protected final List<eeq> e;

   protected ees(List<eeq> $$0) {
      this.e = $$0;
   }

   public static <T extends ees> MapCodec<T> a(Function<List<eeq>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eeq.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
