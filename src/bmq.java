import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bmq extends bml<StringReader> {
   Stream<alb> a();

   @Override
   default Stream<String> possibleValues(bmi<StringReader> $$0) {
      return this.a().map(alb::toString);
   }
}
