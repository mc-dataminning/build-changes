import java.util.stream.Stream;

public interface bpa<S> {
   Stream<String> possibleValues(box<S> var1);

   static <S> bpa<S> b() {
      return $$0 -> Stream.empty();
   }
}
