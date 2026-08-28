import java.util.stream.Stream;

public interface bpi<S> {
   Stream<String> possibleValues(bpf<S> var1);

   static <S> bpi<S> b() {
      return $$0 -> Stream.empty();
   }
}
