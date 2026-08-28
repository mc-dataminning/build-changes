import java.util.stream.Stream;

public interface bno<S> {
   Stream<String> possibleValues(bnl<S> var1);

   static <S> bno<S> b() {
      return $$0 -> Stream.empty();
   }
}
