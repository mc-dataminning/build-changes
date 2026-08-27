import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dws extends dwo {
   protected abstract int a(ats var1, ht var2);

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
