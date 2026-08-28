import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eah implements eaf {
   protected final List<eaf> e;

   protected eah(List<eaf> $$0) {
      this.e = $$0;
   }

   public static <T extends eah> MapCodec<T> a(Function<List<eaf>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eaf.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
