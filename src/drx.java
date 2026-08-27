import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class drx implements drv {
   protected final List<drv> e;

   protected drx(List<drv> $$0) {
      this.e = $$0;
   }

   public static <T extends drx> Codec<T> a(Function<List<drv>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(drv.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
