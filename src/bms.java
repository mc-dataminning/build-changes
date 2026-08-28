import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bms extends bmn<StringReader> {
   Stream<akr> a();

   @Override
   default Stream<String> possibleValues(bmk<StringReader> $$0) {
      return this.a().map(akr::toString);
   }
}
