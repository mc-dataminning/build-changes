import java.util.stream.Stream;

public interface boz<S> {
   Stream<String> possibleValues(bow<S> var1);

   static <S> boz<S> b() {
      return $$0 -> Stream.empty();
   }
}
