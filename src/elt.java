import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class elt extends elp {
   protected abstract int a(azu var1, jh var2);

   @Override
   public Stream<jh> a_(eln $$0, azu $$1, jh $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
