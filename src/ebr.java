import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ebr extends ebn {
   protected abstract int a(awt var1, ib var2);

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
