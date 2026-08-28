import java.util.stream.Stream;

public interface bpx<S> {
   Stream<String> possibleValues(bpu<S> var1);

   static <S> bpx<S> b() {
      return $$0 -> Stream.empty();
   }
}
