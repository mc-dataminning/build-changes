import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmr implements bmm<StringReader, ale> {
   public static final bmm<StringReader, ale> a = new bmr();

   private bmr() {
   }

   @Override
   public Optional<ale> a(bml<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ale.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
