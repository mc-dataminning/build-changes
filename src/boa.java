import java.util.stream.Stream;

public interface boa<S> {
   Stream<String> possibleValues(bnx<S> var1);

   static <S> boa<S> b() {
      return $$0 -> Stream.empty();
   }
}
