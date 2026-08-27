import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ees extends eeo {
   protected abstract int a(axr var1, ib var2);

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
