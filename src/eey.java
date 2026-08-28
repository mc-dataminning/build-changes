import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eey implements eew {
   protected final List<eew> e;

   protected eey(List<eew> $$0) {
      this.e = $$0;
   }

   public static <T extends eey> MapCodec<T> a(Function<List<eew>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eew.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
