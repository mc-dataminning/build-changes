import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ehq extends ehm {
   protected abstract int a(azc var1, iz var2);

   @Override
   public Stream<iz> a_(ehk $$0, azc $$1, iz $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
