import java.util.stream.Stream;

public interface bng<S> {
   Stream<String> possibleValues(bnd<S> var1);

   static <S> bng<S> b() {
      return $$0 -> Stream.empty();
   }
}
