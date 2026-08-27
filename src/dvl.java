import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dvl extends dvh {
   protected abstract int a(ate var1, ht var2);

   @Override
   public Stream<ht> a_(dvf $$0, ate $$1, ht $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
