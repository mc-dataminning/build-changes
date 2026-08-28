import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpa extends bov<StringReader> {
   Stream<alz> a();

   @Override
   default Stream<String> possibleValues(bos<StringReader> $$0) {
      return this.a().map(alz::toString);
   }
}
