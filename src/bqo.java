import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bqo extends bqe<StringReader> {
   Stream<alk> a();

   @Override
   default Stream<String> possibleValues(bqb<StringReader> $$0) {
      return this.a().map(alk::toString);
   }
}
