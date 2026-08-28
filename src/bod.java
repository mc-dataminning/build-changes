import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bod extends bny<StringReader> {
   Stream<aku> a();

   @Override
   default Stream<String> possibleValues(bnv<StringReader> $$0) {
      return this.a().map(aku::toString);
   }
}
