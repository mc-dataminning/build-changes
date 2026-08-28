import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpf extends bpa<StringReader> {
   Stream<alz> a();

   @Override
   default Stream<String> possibleValues(box<StringReader> $$0) {
      return this.a().map(alz::toString);
   }
}
