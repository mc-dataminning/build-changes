import java.util.stream.Stream;

public interface bpq<S> {
   Stream<String> possibleValues(bpn<S> var1);

   static <S> bpq<S> b() {
      return $$0 -> Stream.empty();
   }
}
