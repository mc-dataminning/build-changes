import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class erm extends eri {
   protected abstract int a(azx var1, iv var2);

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
