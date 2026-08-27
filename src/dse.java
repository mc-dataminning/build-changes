import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dse implements dsc {
   protected final List<dsc> e;

   protected dse(List<dsc> $$0) {
      this.e = $$0;
   }

   public static <T extends dse> Codec<T> a(Function<List<dsc>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dsc.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
