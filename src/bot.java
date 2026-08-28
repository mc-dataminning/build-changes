import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bot implements boo<StringReader, aku> {
   public static final boo<StringReader, aku> a = new bot();

   private bot() {
   }

   @Override
   public Optional<aku> a(bon<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(aku.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
