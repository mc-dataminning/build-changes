import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class egw implements egu {
   protected final List<egu> e;

   protected egw(List<egu> $$0) {
      this.e = $$0;
   }

   public static <T extends egw> MapCodec<T> a(Function<List<egu>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(egu.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
