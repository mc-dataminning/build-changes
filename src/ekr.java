import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ekr extends ekn {
   protected abstract int a(azn var1, jf var2);

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
