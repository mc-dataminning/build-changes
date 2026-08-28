import java.util.stream.Stream;

public interface bmr<S> {
   Stream<String> possibleValues(bmo<S> var1);

   static <S> bmr<S> b() {
      return $$0 -> Stream.empty();
   }
}
