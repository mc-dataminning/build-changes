import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dit implements dir {
   protected final List<dir> e;

   protected dit(List<dir> $$0) {
      this.e = $$0;
   }

   public static <T extends dit> Codec<T> a(Function<List<dir>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dir.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
