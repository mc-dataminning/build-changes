import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ebf implements ebd {
   protected final List<ebd> e;

   protected ebf(List<ebd> $$0) {
      this.e = $$0;
   }

   public static <T extends ebf> MapCodec<T> a(Function<List<ebd>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ebd.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
