import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface blv extends blq<StringReader> {
   Stream<akm> a();

   @Override
   default Stream<String> possibleValues(bln<StringReader> $$0) {
      return this.a().map(akm::toString);
   }
}
