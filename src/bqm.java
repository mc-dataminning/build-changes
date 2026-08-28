import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bqm extends bqc<StringReader> {
   Stream<ali> a();

   @Override
   default Stream<String> possibleValues(bpz<StringReader> $$0) {
      return this.a().map(ali::toString);
   }
}
