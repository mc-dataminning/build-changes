import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ebt implements ebr {
   protected final List<ebr> e;

   protected ebt(List<ebr> $$0) {
      this.e = $$0;
   }

   public static <T extends ebt> MapCodec<T> a(Function<List<ebr>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ebr.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
