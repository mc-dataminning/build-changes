import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class ehp implements ehn {
   protected final List<ehn> e;

   protected ehp(List<ehn> $$0) {
      this.e = $$0;
   }

   public static <T extends ehp> MapCodec<T> a(Function<List<ehn>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ehn.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
