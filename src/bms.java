import java.util.stream.Stream;

public interface bms<S> {
   Stream<String> possibleValues(bmp<S> var1);

   static <S> bms<S> b() {
      return $$0 -> Stream.empty();
   }
}
