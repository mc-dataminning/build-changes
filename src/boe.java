import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface boe extends bnz<StringReader> {
   Stream<aku> a();

   @Override
   default Stream<String> possibleValues(bnw<StringReader> $$0) {
      return this.a().map(aku::toString);
   }
}
