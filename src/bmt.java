import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmt extends bmo<StringReader> {
   Stream<ale> a();

   @Override
   default Stream<String> possibleValues(bml<StringReader> $$0) {
      return this.a().map(ale::toString);
   }
}
