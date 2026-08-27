import java.util.stream.Stream;

public interface blq<S> {
   Stream<String> possibleValues(bln<S> var1);

   static <S> blq<S> b() {
      return $$0 -> Stream.empty();
   }
}
