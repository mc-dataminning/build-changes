import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class emv extends emr {
   protected abstract int a(azg var1, ji var2);

   @Override
   public Stream<ji> a_(emp $$0, azg $$1, ji $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
