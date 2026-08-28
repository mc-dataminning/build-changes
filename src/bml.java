import java.util.stream.Stream;

public interface bml<S> {
   Stream<String> possibleValues(bmi<S> var1);

   static <S> bml<S> b() {
      return $$0 -> Stream.empty();
   }
}
