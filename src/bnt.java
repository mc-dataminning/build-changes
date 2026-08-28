import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bnt extends bno<StringReader> {
   Stream<ale> a();

   @Override
   default Stream<String> possibleValues(bnl<StringReader> $$0) {
      return this.a().map(ale::toString);
   }
}
