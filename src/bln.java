import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bln extends bli<StringReader> {
   Stream<akh> a();

   @Override
   default Stream<String> possibleValues(blf<StringReader> $$0) {
      return this.a().map(akh::toString);
   }
}
