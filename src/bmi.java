import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmi extends bmd<StringReader> {
   Stream<akk> a();

   @Override
   default Stream<String> possibleValues(bma<StringReader> $$0) {
      return this.a().map(akk::toString);
   }
}
