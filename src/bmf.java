import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmf implements bma<StringReader, akk> {
   public static final bma<StringReader, akk> a = new bmf();

   private bmf() {
   }

   @Override
   public Optional<akk> a(blz<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akk.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
