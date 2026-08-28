import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eix extends eit {
   protected abstract int a(ayv var1, jd var2);

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
