import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

abstract class dpy implements dpw {
   protected final List<dpw> e;

   protected dpy(List<dpw> $$0) {
      this.e = $$0;
   }

   public static <T extends dpy> Codec<T> a(Function<List<dpw>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(dpw.b.listOf().fieldOf("predicates").forGetter($$0xx -> $$0xx.e)).apply($$1, $$0));
   }
}
