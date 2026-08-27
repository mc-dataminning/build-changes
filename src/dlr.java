import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dlr implements dlp {
   protected final List<dlp> e;

   protected dlr(List<dlp> $$0) {
      this.e = $$0;
   }

   public static <T extends dlr> Codec<T> a(Function<List<dlp>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dlp.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
