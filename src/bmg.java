import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmg implements bmb<StringReader, akk> {
   public static final bmb<StringReader, akk> a = new bmg();

   private bmg() {
   }

   @Override
   public Optional<akk> a(bma<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akk.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
