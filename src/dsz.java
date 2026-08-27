import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dsz implements dsx {
   protected final List<dsx> e;

   protected dsz(List<dsx> $$0) {
      this.e = $$0;
   }

   public static <T extends dsz> Codec<T> a(Function<List<dsx>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dsx.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
