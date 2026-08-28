import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bov extends boq<StringReader> {
   Stream<aku> a();

   @Override
   default Stream<String> possibleValues(bon<StringReader> $$0) {
      return this.a().map(aku::toString);
   }
}
