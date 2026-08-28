import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bof extends boa<StringReader> {
   Stream<akv> a();

   @Override
   default Stream<String> possibleValues(bnx<StringReader> $$0) {
      return this.a().map(akv::toString);
   }
}
