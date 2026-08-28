import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpv extends bpq<StringReader> {
   Stream<ale> a();

   @Override
   default Stream<String> possibleValues(bpn<StringReader> $$0) {
      return this.a().map(ale::toString);
   }
}
