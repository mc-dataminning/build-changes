import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class eja extends eiw {
   protected abstract int a(ayw var1, jd var2);

   @Override
   public Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
