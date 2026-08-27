import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmb extends blw<StringReader> {
   Stream<akt> a();

   @Override
   default Stream<String> possibleValues(blt<StringReader> $$0) {
      return this.a().map(akt::toString);
   }
}
