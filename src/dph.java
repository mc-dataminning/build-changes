import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dph implements dpf {
   protected final List<dpf> e;

   protected dph(List<dpf> $$0) {
      this.e = $$0;
   }

   public static <T extends dph> Codec<T> a(Function<List<dpf>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dpf.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
