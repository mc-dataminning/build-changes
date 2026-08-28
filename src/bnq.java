import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bnq extends bnl<StringReader> {
   Stream<alc> a();

   @Override
   default Stream<String> possibleValues(bni<StringReader> $$0) {
      return this.a().map(alc::toString);
   }
}
