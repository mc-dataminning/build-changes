import java.util.stream.Stream;

public interface bqe<S> {
   Stream<String> possibleValues(bqb<S> var1);

   static <S> bqe<S> b() {
      return $$0 -> Stream.empty();
   }
}
