import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmu implements bmp<StringReader, alf> {
   public static final bmp<StringReader, alf> a = new bmu();

   private bmu() {
   }

   @Override
   public Optional<alf> a(bmo<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alf.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
