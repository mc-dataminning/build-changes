import java.util.stream.Stream;

public interface boq<S> {
   Stream<String> possibleValues(bon<S> var1);

   static <S> boq<S> b() {
      return $$0 -> Stream.empty();
   }
}
