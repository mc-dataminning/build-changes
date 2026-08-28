import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmr extends bmm<StringReader> {
   Stream<akq> a();

   @Override
   default Stream<String> possibleValues(bmj<StringReader> $$0) {
      return this.a().map(akq::toString);
   }
}
