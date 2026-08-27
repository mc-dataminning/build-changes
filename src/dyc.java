import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dyc implements dya {
   protected final List<dya> e;

   protected dyc(List<dya> $$0) {
      this.e = $$0;
   }

   public static <T extends dyc> MapCodec<T> a(Function<List<dya>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(dya.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
