import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class boe implements bnz<StringReader, akv> {
   public static final bnz<StringReader, akv> a = new boe();

   private boe() {
   }

   @Override
   public Optional<akv> a(bny<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akv.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
