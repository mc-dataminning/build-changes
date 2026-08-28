import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bog extends bob<StringReader> {
   Stream<akv> a();

   @Override
   default Stream<String> possibleValues(bny<StringReader> $$0) {
      return this.a().map(akv::toString);
   }
}
