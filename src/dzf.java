import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzf implements dzd {
   protected final List<dzd> e;

   protected dzf(List<dzd> $$0) {
      this.e = $$0;
   }

   public static <T extends dzf> MapCodec<T> a(Function<List<dzd>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dzd.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
