import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class ehw extends ehs {
   protected abstract int a(azh var1, iz var2);

   @Override
   public Stream<iz> a_(ehq $$0, azh $$1, iz $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
