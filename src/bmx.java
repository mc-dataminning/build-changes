import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmx extends bms<StringReader> {
   Stream<alf> a();

   @Override
   default Stream<String> possibleValues(bmp<StringReader> $$0) {
      return this.a().map(alf::toString);
   }
}
