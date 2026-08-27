import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dtx implements dtv {
   protected final List<dtv> e;

   protected dtx(List<dtv> $$0) {
      this.e = $$0;
   }

   public static <T extends dtx> Codec<T> a(Function<List<dtv>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dtv.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
