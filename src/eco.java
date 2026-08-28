import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eco implements ecm {
   protected final List<ecm> e;

   protected eco(List<ecm> $$0) {
      this.e = $$0;
   }

   public static <T extends eco> MapCodec<T> a(Function<List<ecm>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ecm.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
