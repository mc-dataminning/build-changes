import java.util.stream.Stream;

public interface bpv<S> {
   Stream<String> possibleValues(bps<S> var1);

   static <S> bpv<S> b() {
      return $$0 -> Stream.empty();
   }
}
