import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bpy extends bpt<StringReader> {
   Stream<alg> a();

   @Override
   default Stream<String> possibleValues(bpq<StringReader> $$0) {
      return this.a().map(alg::toString);
   }
}
