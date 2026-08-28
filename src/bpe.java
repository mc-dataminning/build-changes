import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpe extends boz<StringReader> {
   Stream<alz> a();

   @Override
   default Stream<String> possibleValues(bow<StringReader> $$0) {
      return this.a().map(alz::toString);
   }
}
