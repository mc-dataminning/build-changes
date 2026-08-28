import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bnl extends bng<StringReader> {
   Stream<alb> a();

   @Override
   default Stream<String> possibleValues(bnd<StringReader> $$0) {
      return this.a().map(alb::toString);
   }
}
