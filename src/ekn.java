import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ekn extends ekj {
   protected abstract int a(azl var1, je var2);

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
