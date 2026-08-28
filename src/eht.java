import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eht extends ehp {
   protected abstract int a(azf var1, iz var2);

   @Override
   public Stream<iz> a_(ehn $$0, azf $$1, iz $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
