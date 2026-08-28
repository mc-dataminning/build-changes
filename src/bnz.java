import java.util.stream.Stream;

public interface bnz<S> {
   Stream<String> possibleValues(bnw<S> var1);

   static <S> bnz<S> b() {
      return $$0 -> Stream.empty();
   }
}
