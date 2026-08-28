import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bqx extends bqn<StringReader> {
   Stream<alr> a();

   @Override
   default Stream<String> possibleValues(bqk<StringReader> $$0) {
      return this.a().map(alr::toString);
   }
}
