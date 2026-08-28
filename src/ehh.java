import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ehh implements ehf {
   protected final List<ehf> e;

   protected ehh(List<ehf> $$0) {
      this.e = $$0;
   }

   public static <T extends ehh> MapCodec<T> a(Function<List<ehf>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ehf.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
