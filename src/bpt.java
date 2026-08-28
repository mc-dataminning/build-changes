import java.util.stream.Stream;

public interface bpt<S> {
   Stream<String> possibleValues(bpq<S> var1);

   static <S> bpt<S> b() {
      return $$0 -> Stream.empty();
   }
}
