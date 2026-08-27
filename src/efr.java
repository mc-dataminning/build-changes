import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class efr extends efn {
   protected abstract int a(ayd var1, im var2);

   @Override
   public Stream<im> a_(efl $$0, ayd $$1, im $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
