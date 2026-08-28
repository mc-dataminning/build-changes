import java.util.stream.Stream;

public interface blz<S> {
   Stream<String> possibleValues(blw<S> var1);

   static <S> blz<S> b() {
      return $$0 -> Stream.empty();
   }
}
