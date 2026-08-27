import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class egu extends egq {
   protected abstract int a(ayk var1, io var2);

   @Override
   public Stream<io> a_(ego $$0, ayk $$1, io $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
