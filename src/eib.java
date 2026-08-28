import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eib extends ehx {
   protected abstract int a(aym var1, ja var2);

   @Override
   public Stream<ja> a_(ehv $$0, aym $$1, ja $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
