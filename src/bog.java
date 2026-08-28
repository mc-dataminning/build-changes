import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bog extends bob<StringReader> {
   Stream<alj> a();

   @Override
   default Stream<String> possibleValues(bny<StringReader> $$0) {
      return this.a().map(alj::toString);
   }
}
