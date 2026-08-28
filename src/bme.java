import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bme extends blz<StringReader> {
   Stream<akk> a();

   @Override
   default Stream<String> possibleValues(blw<StringReader> $$0) {
      return this.a().map(akk::toString);
   }
}
