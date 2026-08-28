import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dzp implements dzn {
   protected final List<dzn> e;

   protected dzp(List<dzn> $$0) {
      this.e = $$0;
   }

   public static <T extends dzp> MapCodec<T> a(Function<List<dzn>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dzn.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
