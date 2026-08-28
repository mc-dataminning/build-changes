import java.util.stream.Stream;

public interface bov<S> {
   Stream<String> possibleValues(bos<S> var1);

   static <S> bov<S> b() {
      return $$0 -> Stream.empty();
   }
}
