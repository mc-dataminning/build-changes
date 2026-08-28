import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bqa extends bpv<StringReader> {
   Stream<alg> a();

   @Override
   default Stream<String> possibleValues(bps<StringReader> $$0) {
      return this.a().map(alg::toString);
   }
}
