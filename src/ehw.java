import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ehw implements ehu {
   protected final List<ehu> e;

   protected ehw(List<ehu> $$0) {
      this.e = $$0;
   }

   public static <T extends ehw> MapCodec<T> a(Function<List<ehu>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ehu.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
