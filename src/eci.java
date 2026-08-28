import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class eci implements ecg {
   protected final List<ecg> e;

   protected eci(List<ecg> $$0) {
      this.e = $$0;
   }

   public static <T extends eci> MapCodec<T> a(Function<List<ecg>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ecg.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
