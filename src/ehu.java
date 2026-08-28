import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ehu extends ehq {
   protected abstract int a(azg var1, iz var2);

   @Override
   public Stream<iz> a_(eho $$0, azg $$1, iz $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
