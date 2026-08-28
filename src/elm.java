import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class elm extends eli {
   protected abstract int a(azv var1, jh var2);

   @Override
   public Stream<jh> a_(elg $$0, azv $$1, jh $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
