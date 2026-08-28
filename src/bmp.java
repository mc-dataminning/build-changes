import java.util.stream.Stream;

public interface bmp<S> {
   Stream<String> possibleValues(bmm<S> var1);

   static <S> bmp<S> b() {
      return $$0 -> Stream.empty();
   }
}
