import java.util.stream.Stream;

public interface bqn<S> {
   Stream<String> possibleValues(bqk<S> var1);

   static <S> bqn<S> b() {
      return $$0 -> Stream.empty();
   }
}
