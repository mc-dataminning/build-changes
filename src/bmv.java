import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmv extends bmq<StringReader> {
   Stream<alf> a();

   @Override
   default Stream<String> possibleValues(bmn<StringReader> $$0) {
      return this.a().map(alf::toString);
   }
}
