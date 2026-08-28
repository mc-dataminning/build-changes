import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmh extends bmc<StringReader> {
   Stream<akk> a();

   @Override
   default Stream<String> possibleValues(blz<StringReader> $$0) {
      return this.a().map(akk::toString);
   }
}
