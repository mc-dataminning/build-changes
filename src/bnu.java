import java.util.stream.Stream;

public interface bnu<S> {
   Stream<String> possibleValues(bnr<S> var1);

   static <S> bnu<S> b() {
      return $$0 -> Stream.empty();
   }
}
