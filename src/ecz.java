import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ecz implements ecx {
   protected final List<ecx> e;

   protected ecz(List<ecx> $$0) {
      this.e = $$0;
   }

   public static <T extends ecz> MapCodec<T> a(Function<List<ecx>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ecx.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
