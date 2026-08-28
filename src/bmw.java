import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmw extends bmr<StringReader> {
   Stream<alf> a();

   @Override
   default Stream<String> possibleValues(bmo<StringReader> $$0) {
      return this.a().map(alf::toString);
   }
}
