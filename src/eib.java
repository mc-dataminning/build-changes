import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eib implements ehz {
   protected final List<ehz> e;

   protected eib(List<ehz> $$0) {
      this.e = $$0;
   }

   public static <T extends eib> MapCodec<T> a(Function<List<ehz>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ehz.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
