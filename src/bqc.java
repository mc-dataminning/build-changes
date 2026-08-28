import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bqc extends bpx<StringReader> {
   Stream<alg> a();

   @Override
   default Stream<String> possibleValues(bpu<StringReader> $$0) {
      return this.a().map(alg::toString);
   }
}
