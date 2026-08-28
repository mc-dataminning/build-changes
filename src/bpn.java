import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpn extends bpi<StringReader> {
   Stream<ald> a();

   @Override
   default Stream<String> possibleValues(bpf<StringReader> $$0) {
      return this.a().map(ald::toString);
   }
}
