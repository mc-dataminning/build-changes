import java.util.stream.Stream;

public interface bob<S> {
   Stream<String> possibleValues(bny<S> var1);

   static <S> bob<S> b() {
      return $$0 -> Stream.empty();
   }
}
