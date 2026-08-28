import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmu extends bmp<StringReader> {
   Stream<ale> a();

   @Override
   default Stream<String> possibleValues(bmm<StringReader> $$0) {
      return this.a().map(ale::toString);
   }
}
