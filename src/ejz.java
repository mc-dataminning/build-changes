import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ejz extends ejv {
   protected abstract int a(azk var1, je var2);

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
