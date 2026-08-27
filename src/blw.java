import java.util.stream.Stream;

public interface blw<S> {
   Stream<String> possibleValues(blt<S> var1);

   static <S> blw<S> b() {
      return $$0 -> Stream.empty();
   }
}
