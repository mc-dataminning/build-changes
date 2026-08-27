import java.util.stream.Stream;

public interface bli<S> {
   Stream<String> possibleValues(blf<S> var1);

   static <S> bli<S> b() {
      return $$0 -> Stream.empty();
   }
}
