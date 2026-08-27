import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dlv implements dlt {
   protected final List<dlt> e;

   protected dlv(List<dlt> $$0) {
      this.e = $$0;
   }

   public static <T extends dlv> Codec<T> a(Function<List<dlt>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dlt.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
