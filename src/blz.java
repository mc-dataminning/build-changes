import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class blz implements blu<StringReader, akt> {
   public static final blu<StringReader, akt> a = new blz();

   private blz() {
   }

   @Override
   public Optional<akt> a(blt<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akt.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
