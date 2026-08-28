import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eqt extends eqp {
   protected abstract int a(azv var1, iv var2);

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
