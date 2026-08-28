import java.util.stream.Stream;

public interface bny<S> {
   Stream<String> possibleValues(bnv<S> var1);

   static <S> bny<S> b() {
      return $$0 -> Stream.empty();
   }
}
