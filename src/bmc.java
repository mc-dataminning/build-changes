import java.util.stream.Stream;

public interface bmc<S> {
   Stream<String> possibleValues(blz<S> var1);

   static <S> bmc<S> b() {
      return $$0 -> Stream.empty();
   }
}
