import java.util.stream.Stream;

public interface bmn<S> {
   Stream<String> possibleValues(bmk<S> var1);

   static <S> bmn<S> b() {
      return $$0 -> Stream.empty();
   }
}
