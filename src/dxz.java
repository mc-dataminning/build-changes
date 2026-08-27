import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dxz extends dxv {
   protected abstract int a(auf var1, hv var2);

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
