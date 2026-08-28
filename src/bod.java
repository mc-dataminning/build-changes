import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bod extends bny<StringReader> {
   Stream<all> a();

   @Override
   default Stream<String> possibleValues(bnv<StringReader> $$0) {
      return this.a().map(all::toString);
   }
}
