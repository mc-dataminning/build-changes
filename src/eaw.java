import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eaw extends eas {
   protected abstract int a(awp var1, hz var2);

   @Override
   public Stream<hz> a_(eaq $$0, awp $$1, hz $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
