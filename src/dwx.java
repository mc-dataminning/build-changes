import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dwx extends dwt {
   protected abstract int a(atw var1, hx var2);

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
