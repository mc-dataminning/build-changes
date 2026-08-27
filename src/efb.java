import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class efb extends eex {
   protected abstract int a(axt var1, id var2);

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
