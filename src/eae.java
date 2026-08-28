import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eae implements eac {
   protected final List<eac> e;

   protected eae(List<eac> $$0) {
      this.e = $$0;
   }

   public static <T extends eae> MapCodec<T> a(Function<List<eac>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eac.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
