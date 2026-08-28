import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ebx implements ebv {
   protected final List<ebv> e;

   protected ebx(List<ebv> $$0) {
      this.e = $$0;
   }

   public static <T extends ebx> MapCodec<T> a(Function<List<ebv>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ebv.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
