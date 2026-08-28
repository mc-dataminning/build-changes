import java.util.stream.Stream;

public interface bnl<S> {
   Stream<String> possibleValues(bni<S> var1);

   static <S> bnl<S> b() {
      return $$0 -> Stream.empty();
   }
}
