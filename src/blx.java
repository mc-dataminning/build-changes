import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface blx extends bls<StringReader> {
   Stream<akn> a();

   @Override
   default Stream<String> possibleValues(blp<StringReader> $$0) {
      return this.a().map(akn::toString);
   }
}
