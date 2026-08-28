import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzd implements dzb {
   protected final List<dzb> e;

   protected dzd(List<dzb> $$0) {
      this.e = $$0;
   }

   public static <T extends dzd> MapCodec<T> a(Function<List<dzb>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dzb.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
