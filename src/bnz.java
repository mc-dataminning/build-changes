import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bnz extends bnu<StringReader> {
   Stream<ali> a();

   @Override
   default Stream<String> possibleValues(bnr<StringReader> $$0) {
      return this.a().map(ali::toString);
   }
}
