import java.util.stream.Stream;

public interface bmm<S> {
   Stream<String> possibleValues(bmj<S> var1);

   static <S> bmm<S> b() {
      return $$0 -> Stream.empty();
   }
}
