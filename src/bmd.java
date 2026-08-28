import java.util.stream.Stream;

public interface bmd<S> {
   Stream<String> possibleValues(bma<S> var1);

   static <S> bmd<S> b() {
      return $$0 -> Stream.empty();
   }
}
