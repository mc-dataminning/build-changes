import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class elc extends eky {
   protected abstract int a(azr var1, jg var2);

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
