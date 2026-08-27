import java.util.stream.Stream;

public interface bls<S> {
   Stream<String> possibleValues(blp<S> var1);

   static <S> bls<S> b() {
      return $$0 -> Stream.empty();
   }
}
