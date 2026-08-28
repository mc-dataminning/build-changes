import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bnx extends bns<StringReader> {
   Stream<alh> a();

   @Override
   default Stream<String> possibleValues(bnp<StringReader> $$0) {
      return this.a().map(alh::toString);
   }
}
