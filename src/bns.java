import java.util.stream.Stream;

public interface bns<S> {
   Stream<String> possibleValues(bnp<S> var1);

   static <S> bns<S> b() {
      return $$0 -> Stream.empty();
   }
}
