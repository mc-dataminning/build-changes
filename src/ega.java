import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ega extends efw {
   protected abstract int a(ayg var1, in var2);

   @Override
   public Stream<in> a_(efu $$0, ayg $$1, in $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
