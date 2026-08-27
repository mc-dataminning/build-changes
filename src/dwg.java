import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class dwg extends dwc {
   protected abstract int a(ato var1, ht var2);

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
