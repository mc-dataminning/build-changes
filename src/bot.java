import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bot implements boo<StringReader, alp> {
   public static final boo<StringReader, alp> a = new bot();

   private bot() {
   }

   @Override
   public Optional<alp> a(bon<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alp.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
