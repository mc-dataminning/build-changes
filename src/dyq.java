import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dyq extends dym {
   protected abstract int a(auu var1, hx var2);

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
