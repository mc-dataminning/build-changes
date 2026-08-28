import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ejc extends eiy {
   protected abstract int a(ayw var1, jd var2);

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
