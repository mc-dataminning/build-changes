import java.util.stream.Stream;

public interface bmo<S> {
   Stream<String> possibleValues(bml<S> var1);

   static <S> bmo<S> b() {
      return $$0 -> Stream.empty();
   }
}
