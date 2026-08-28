import java.util.stream.Stream;

public interface bqc<S> {
   Stream<String> possibleValues(bpz<S> var1);

   static <S> bqc<S> b() {
      return $$0 -> Stream.empty();
   }
}
