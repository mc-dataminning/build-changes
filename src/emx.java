import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class emx extends emt {
   protected abstract int a(azh var1, ji var2);

   @Override
   public Stream<ji> a_(emr $$0, azh $$1, ji $$2) {
      return IntStream.range(0, this.a($$1, $$2)).mapToObj($$1x -> $$2);
   }
}
