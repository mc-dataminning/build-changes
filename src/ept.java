import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ept extends epp {
   protected abstract int a(azt var1, iu var2);

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
