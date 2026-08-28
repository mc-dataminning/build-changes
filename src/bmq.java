import java.util.stream.Stream;

public interface bmq<S> {
   Stream<String> possibleValues(bmn<S> var1);

   static <S> bmq<S> b() {
      return $$0 -> Stream.empty();
   }
}
