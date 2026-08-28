import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eer implements eep {
   protected final List<eep> e;

   protected eer(List<eep> $$0) {
      this.e = $$0;
   }

   public static <T extends eer> MapCodec<T> a(Function<List<eep>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eep.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
